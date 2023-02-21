package forCycles;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfNums = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = 1; i <= numberOfNums; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            totalSum += currentNum;

        }

        System.out.println(totalSum);

    }
}
