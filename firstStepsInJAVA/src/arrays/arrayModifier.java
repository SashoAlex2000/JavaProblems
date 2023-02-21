package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String line = scanner.nextLine();

        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");
            String command = shredded[0];

            if ("swap".equals(command)) {
                int firstIndex = Integer.parseInt(shredded[1]);
                int secondIndex = Integer.parseInt(shredded[2]);

                int mid = arr[secondIndex];
                arr[secondIndex] = arr[firstIndex];
                arr[firstIndex] = mid;

            } else if ("multiply".equals(command)) {
                int firstIndex = Integer.parseInt(shredded[1]);
                int secondIndex = Integer.parseInt(shredded[2]);

                arr[firstIndex] = arr[firstIndex] * arr[secondIndex];

            } else if ("decrease".equals(command)) {

                for (int i = 0; i < arr.length; i++) {
                    arr[i]--;
                }

            }

            line = scanner.nextLine();

        }

        System.out.println(Arrays.toString(arr));

    }

}
