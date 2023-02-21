package methods;

import java.util.Scanner;

public class vowelCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int result = countVoews(word);

        System.out.print(result);

    }

    private static int countVoews(String word) {

        int numberOfVowels = 0;

        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);

            if ("aeiouAEIOU".indexOf(currentChar) != -1) {
                numberOfVowels++;
            }

        }

        return numberOfVowels;

    }

}
