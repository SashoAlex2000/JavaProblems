package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gaussTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int [] arr = Arrays
                .stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length / 2; i++) {

            int currentNum = arr[i] + arr[arr.length - 1 -i];

            list.add(currentNum);

        }

        if (arr.length / 2 != 0) {
            list.add(arr[arr.length / 2]);
        }

        System.out.print(list);

    }

}
