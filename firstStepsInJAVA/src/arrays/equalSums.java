package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        int [] arr = Arrays
                .stream(input.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        boolean exists = false;

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            if (i == 0) {
                leftSum = 0;
            } else {
                for (int l = 0; l < i; l++) {
                    leftSum += arr[l];
                }
            }

            if (i == arr.length - 1) {
                rightSum = 0;
            } else {
                for (int r = i + 1; r < arr.length; r++) {
                    rightSum += arr[r];
                }
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                exists = true;
                break;
            }

        }

        if (!exists) {
            System.out.println("no");
        }


    }

}
