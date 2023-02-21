package forCycles;

import java.util.Scanner;

public class stringOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            System.out.println(word.charAt(i));
        }

    }
}
