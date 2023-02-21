package methods;

import java.util.Scanner;

public class printTriangles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String pyramid = printTriangles(n);

        System.out.print(pyramid);

    }

    private static String printTriangles(int num) {

        String result = "";

        for (int i = 0; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                result += j + " ";
            }

            result += "\n";
        }

        for (int k = num - 1; k > 0; k--) {

            for (int l = 1; l <= k; l++) {
                result += l + " ";
            }

            result += "\n";

        }

        return result;

    }

}
