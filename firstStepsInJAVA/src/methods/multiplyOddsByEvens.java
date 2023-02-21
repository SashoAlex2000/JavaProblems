package methods;

import java.util.Scanner;

public class multiplyOddsByEvens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = getMultipleOfEvensAndOdds(inputNumber);

        System.out.print(result);

    }

    private static int getMultipleOfEvensAndOdds (int number) {

        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;

    }

    private static int getEvenSum (int number) {

        int currentSum = 0;
        String stringNumber = Integer.toString(number);

        for (int i = 0; i < stringNumber.length(); i++) {

            int currentNum = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            if (currentNum % 2 == 0) {
                currentSum += currentNum;
            }
        }

        return currentSum;

    }

    private static int getOddSum (int number) {

        int currentOddSum = 0;
        String stringNumber = Integer.toString(number);

        for (int i = 0; i < stringNumber.length(); i++) {

            int currentNum = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            if (currentNum % 2 != 0) {
                currentOddSum += currentNum;
            }
        }

        return currentOddSum;

    }

}
