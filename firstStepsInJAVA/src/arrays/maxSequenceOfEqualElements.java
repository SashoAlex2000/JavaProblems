package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int [] arr = Arrays
                .stream(input.split((" ")))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int longestStreak = 0;
        int currentStreak = 0;
        int lastNumber = -9999999;
        int magicIndex = -1;
        int currentIndex = -1;

        for (int i = 0; i< arr.length; i++) {

            int currentNum = arr[i];
            System.out.printf("Current num is: %d\n", currentNum);

            if (i == 0) {
                lastNumber = currentNum;
                currentStreak = 1;
                longestStreak = 1;
                currentIndex = 0;
                magicIndex = 0;
                continue;
            }

            if (currentNum == lastNumber) {
                currentStreak += 1;
            } else {
                currentIndex = i;
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                magicIndex = currentIndex;
                longestStreak = currentStreak;

            }

            lastNumber = currentNum;

        }

        System.out.printf("%d\n", magicIndex);

        for (int i = magicIndex; i < magicIndex + longestStreak; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

}
