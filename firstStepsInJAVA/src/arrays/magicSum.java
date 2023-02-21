package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int [] arr = Arrays
                .stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {

            int currentNum = arr[i];

            for (int j = i; j < arr.length; j++) {

                if (currentNum + arr[j] == magicSum) {
                    System.out.printf("%d %d\n", currentNum, arr[j]);
                }

            }

        }

    }

}
