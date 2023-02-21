package conditionalStatements.lab;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String result;
        if (number % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.println(result);

    }
}
