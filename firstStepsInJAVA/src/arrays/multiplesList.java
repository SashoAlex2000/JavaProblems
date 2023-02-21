package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multiplesList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int factor = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        int [] array = new int[count];

        int counter = 0;
        int currentNum = 1;

        while (true) {

            if (currentNum % factor == 0) {
                array[counter] = currentNum;
                counter++;
            }

            if (counter == count) {
                break;
            }

            currentNum++;

        }

        System.out.println(Arrays.toString(array));
    }
}
