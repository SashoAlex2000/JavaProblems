package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class evenMinusOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];

            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }

        }

        System.out.println(evenSum - oddSum);


    }

}
