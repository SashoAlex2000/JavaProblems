package arrays;

import java.util.Scanner;

public class train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        for (int i = 0; i < n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            System.out.printf("%d ", currentNum);
            totalSum += currentNum;

        }

        System.out.printf("\n%d", totalSum);

    }

}
