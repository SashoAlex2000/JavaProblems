package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalEvenNumSum = 0;

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        for (int i =0; i < numbers.length; i++) {
            int currentNum = numbers[i];

            if (currentNum % 2 == 0) {
                totalEvenNumSum += currentNum;
            }

        }

        System.out.println(totalEvenNumSum);

    }

}
