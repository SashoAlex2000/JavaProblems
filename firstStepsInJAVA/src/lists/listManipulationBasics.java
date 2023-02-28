package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // list is immutable :? ; has to be surrounded with ArrayList
//        List<Integer> numbers = new java.util.ArrayList<>(Arrays
//                .stream(input.split(" "))
//                .map(Integer::parseInt)
//                .toList());

        List<Integer> numbers = new java.util.ArrayList<>(Arrays
                .stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e)).boxed().collect(Collectors.toList()));

        String line = scanner.nextLine();

        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");

            String command = shredded[0];
            int num = Integer.parseInt(shredded[1]);

            if ("Add".equals(command)) {
                numbers.add(numbers.size(), num);
            } else if ("Remove".equals(command)) {
                int indexx = numbers.indexOf(num);
                numbers.remove(indexx);
            } else if ("RemoveAt".equals(command)) {
                numbers.remove(num);
            } else {
                int index = Integer.parseInt(shredded[2]);
                numbers.add(index, num);
            }

            line = scanner.nextLine();

        }

        System.out.println(numbers);

    }

}
