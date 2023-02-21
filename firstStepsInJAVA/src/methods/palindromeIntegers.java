package methods;

import java.util.Scanner;

public class palindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!"END".equals(line)) {

            int currentNum = Integer.parseInt(line);
            boolean result = checkIfPalindrome(currentNum);
            System.out.println(result);
            line = scanner.nextLine();

        }

    }

    private static boolean checkIfPalindrome (int num) {

        boolean cond = false;

        String initial = String.valueOf(num);
        String reversed = "";

        for (int i = initial.length() - 1; i >= 0; i--) {
            reversed += String.valueOf(initial.charAt(i));
        }

        if (initial.equals(reversed)) {
            cond = true;
        }

        return cond;
    }

}
