package forCycles;

import java.util.Scanner;

import static java.lang.Math.abs;

public class oddEvenSum {
    public static void main(String[] args) {

        int oddSum = 0;
        int evenSum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i  % 2 ==0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }

        }

        int difference = abs(evenSum - oddSum);

        if (difference == 0) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }

    }
}
