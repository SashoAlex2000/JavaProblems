package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayRotatiom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {

            int firstElement = list.get(0);
            list.remove(0);
            list.add(firstElement);

        }

        System.out.println(list);

    }

}
