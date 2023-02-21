package methods;

import java.util.Scanner;

public class middleChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = getMiddleChars(input);

        System.out.print(result);

    }

    private static String getMiddleChars(String word) {

        String result = "";

        if (word.length() % 2 != 0) {
            result += String.valueOf(word.charAt(word.length() / 2));
        } else {
            result += String.valueOf(word.charAt((word.length() / 2) - 1));
            result += String.valueOf(word.charAt(word.length() / 2));
        }

        return result;
    }

}
