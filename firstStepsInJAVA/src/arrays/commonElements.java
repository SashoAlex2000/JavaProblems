package arrays;

import java.util.Scanner;

public class commonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length; i ++) {
            String currentElement = arr[i];

            for (int j = 0; j < secondArr.length; j++) {
                String innerElement = secondArr[j];
                if (currentElement.equals(innerElement)) {
                    System.out.printf("%s ", currentElement);
                }
            }

        }

    }

}
