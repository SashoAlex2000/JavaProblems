package arrays;

import java.util.Scanner;

public class numbersInReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numArray = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            numArray[i] = currentNum;

        }

        for (int i = n-1; i >=0; i--) {
            System.out.printf("%d ", numArray[i]);
        }

    }

}
