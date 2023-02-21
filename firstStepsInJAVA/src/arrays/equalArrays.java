package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();

        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();

        boolean areIdentical = true;
        int firstSum = 0;

        if (firstArr.length!= secondArr.length) {
            areIdentical = false;
        } else {

            for (int i = 0; i < firstArr.length; i++) {
                firstSum += firstArr[i];

                if (firstArr[i] != secondArr[i]) {
                    areIdentical = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }

        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", firstSum);
        }

    }

}
