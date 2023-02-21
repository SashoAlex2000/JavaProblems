package methods;

import java.util.Scanner;

public class smallestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = getSmallest(first, second, third);

        System.out.print(result);


    }

    private static int getSmallest(int a, int b, int c) {

        return Math.min(Math.min(a,b), c);

    }

}
