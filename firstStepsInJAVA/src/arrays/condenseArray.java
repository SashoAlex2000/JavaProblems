package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();

        while (true) {

            if (array.length == 1) {
                break;
            }

            int [] condensed = new int [array.length-1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = array[i] +  array[i+1];
            }

            array = condensed;

        }

        System.out.println(array[0]);

    }

}
