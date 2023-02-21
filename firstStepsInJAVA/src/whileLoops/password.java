package whileLoops;

import java.util.Scanner;

public class password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {

            String input = scanner.nextLine();

            if (password.equals(input)) {
                System.out.printf("Welcome, %s", username);
                break;
            }

        }

    }

}
