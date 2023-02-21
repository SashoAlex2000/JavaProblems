package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] firstArray = new int[n];
        int [] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int [] shredded = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            if (i % 2 == 0) {
                firstArray[i] = shredded[0];
                secondArray[i] = shredded[1];
            } else {
                firstArray[i] = shredded[1];
                secondArray[i] = shredded[0];
            }


        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

    }

}
