package methods;

import java.util.Scanner;

public class nXnMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String toPrint = makeStringMatrix(n);

        System.out.print(toPrint);

    }

    private static String makeStringMatrix(int num) {

        String result = "";

        for (int i = 0; i < num; i ++) {

            String temp = "";

            for (int j = 0; j < num; j++) {
                temp += num + " ";
            }

            temp = temp.trim();
            temp += "\n";
            result += temp;

        }

        return result;

    }

}
