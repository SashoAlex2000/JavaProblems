package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArraySecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(array));

        int n = array.length;

        int middle = n / 2;

        if (n % 2 == 0) {
            middle--;
        }

        for (int i =0; i <=middle; i++) {
            String first = array[i];
            String second = array[n-1-i];

            array[i] = second;
            array[n-1-i] = first;

        }

        System.out.println(Arrays.toString(array));


    }
}
