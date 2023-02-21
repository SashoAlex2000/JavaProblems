package forCycles;

import java.util.Scanner;

public class elementEqualToSumOfOthers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int biggest = Integer.MIN_VALUE;
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            totalSum += currentNum;

            if (currentNum > biggest) {
                biggest = currentNum;
            }

        }

        int othersSum = totalSum - biggest;

        if (othersSum == biggest) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggest);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(othersSum - biggest));
        }


    }
}
