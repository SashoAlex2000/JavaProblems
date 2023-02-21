package methods;

import java.util.Scanner;

public class topNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            boolean result = checkIfNumberIsTop(i);
            if (result) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkIfNumberIsTop (int num) {

        boolean cond = false;

        String stringNumber = String.valueOf(num);
        int sumOfDigits = 0;
        boolean hasOdd = false;

        for (int i = 0; i < stringNumber.length(); i++) {

            int currentDigit = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));

            if (currentDigit % 2 != 0) {
                hasOdd = true;
            }
            sumOfDigits += currentDigit;

        }

        if (hasOdd && sumOfDigits % 8 ==0) {
            cond = true;
        }

        return cond;
    }

}
