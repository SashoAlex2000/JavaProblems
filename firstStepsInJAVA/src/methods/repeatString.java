package methods;

import java.util.Scanner;

public class repeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatString(word, n);

        System.out.print(result);

    }

    private static String repeatString(String word, int times) {

        String result = "";

        for (int i = 0; i < times; i++) {
            result += word;
        }

        return result;

    }

}
