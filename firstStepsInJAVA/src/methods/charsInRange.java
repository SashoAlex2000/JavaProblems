package methods;

import java.util.Scanner;

public class charsInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        String toPrint = displayCharsInRange(first, second);

        System.out.print(toPrint);

    }

    private static String displayCharsInRange (char a, int b) {

        int firstCharASCIIValue =  a;
        int secondCharASCIIValue =  b;

        String result = "";

        if (firstCharASCIIValue > secondCharASCIIValue) {
            firstCharASCIIValue = b;
            secondCharASCIIValue  = a;
        }


        for (int i = firstCharASCIIValue + 1; i < secondCharASCIIValue; i++) {
            String currentCharASCII = Character.toString((char) i);
            result += currentCharASCII + " ";
        }

        return result;

    }

}
