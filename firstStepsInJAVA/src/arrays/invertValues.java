package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class invertValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;
        }

        System.out.println(Arrays.toString(arr));

    }

}
