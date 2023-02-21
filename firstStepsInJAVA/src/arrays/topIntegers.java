package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class topIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        int [] arr = Arrays.
                stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        List<Integer> topIntegers = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                topIntegers.add(arr[i]);
                break;
            }

            int currentNum = arr[i];
            boolean biggest = true;


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > currentNum) {
                    biggest = false;
                }
            }

            if (biggest) {
                topIntegers.add(currentNum);
            }

        }

        System.out.println(topIntegers);

        topIntegers.forEach((e) -> System.out.printf("%d ", e));

    }

}
