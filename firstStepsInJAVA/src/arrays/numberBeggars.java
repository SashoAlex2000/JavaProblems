package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numberBeggars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] integers = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        System.out.println(Arrays.toString(integers));

        int numberOfbeggars = Integer.parseInt(scanner.nextLine());

        int [] prizes = new int [numberOfbeggars];


        int counter = 0;

        for (int i = 0; i < integers.length; i++) {
            prizes[counter] += integers[i];
            counter++;

            if (counter == numberOfbeggars) {
                counter = 0;
            }

        }

        System.out.println(Arrays.toString(prizes));


    }

}
