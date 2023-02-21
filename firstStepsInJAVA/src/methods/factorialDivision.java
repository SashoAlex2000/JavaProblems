package methods;

import java.util.Scanner;

public class factorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int factorialFirst = calculateFactorial(first);
        int factorialSecond = calculateFactorial(second);

        double result = factorialFirst * 1.00 / factorialSecond;

        System.out.printf("%.2f", result);

    }

    private static int calculateFactorial (int num) {

        int result = 1;

        for (int i = num; i > 1; i--) {
            result *= i;
        }

        return result;

    }

}
