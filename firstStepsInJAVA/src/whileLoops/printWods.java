package whileLoops;

import java.util.Scanner;

public class printWods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if ("Stop".equals(input)) {
                break;
            }

            System.out.println(input);

        }
    }
}
