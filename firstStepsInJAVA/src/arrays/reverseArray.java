package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String array = Arrays.toString(Arrays.stream(scanner.nextLine().split(" ")).toString().toCharArray());
//        String array = Arrays.toString(scanner.nextLine().split(" "));
        String[] array = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(array));

        int n = array.length;
        String [] newArray = new String [n];
        int arrCounter = 0;

        for (int i = n-1; i >=0 ; i--) {
            newArray[arrCounter] = array[i];
            arrCounter++;
        }

        System.out.println(Arrays.toString(newArray));

//        for (int i = 0; i < array.length(); i++) {
//            System.out.println(array[i]);
//        }


    }

}
