package methods;

import java.util.Scanner;

public class greaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfArgs = scanner.nextLine();

        if ("int".equals(typeOfArgs)) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int result = getMax(first, second);
            System.out.print(result);
        } else if ("char".equals(typeOfArgs)) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char result = getMax(first, second);
            System.out.print(result);
        } else if ("string".equals(typeOfArgs)) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String result = getMax(first, second);
            System.out.print(result);
        }

    }

    // this is what overloading is, same function,
    // but different overall method signature, due to different types of params
    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static String getMax(String a, String b) {
        if (a.compareTo(b) > 0) {
            return a;
        }
        return b;
    }

}
