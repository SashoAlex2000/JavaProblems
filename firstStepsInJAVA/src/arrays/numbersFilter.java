package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numbersFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            array[i] = currentNum;

        }

        String command = scanner.nextLine();
        List<String> list = new ArrayList<>();

        if ("even".equals(command)) {
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0 || array[i] == 0) {
                    list.add(String.valueOf(array[i]));
                }
            }
        } else if ("odd".equals(command)) {
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    list.add(String.valueOf(array[i]));
                }
            }
        } else if ("positive".equals(command)) {
            for (int i = 0; i < n; i++) {
                if (array[i] >= 0) {
                    list.add(String.valueOf(array[i]));
                }
            }
        } else if ("negative".equals(command)) {
            for (int i = 0; i < n; i++) {
                if (array[i] < 0) {
                    list.add(String.valueOf(array[i]));
                }
            }
        }

        String [] finalArr = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(finalArr));

    }

}
