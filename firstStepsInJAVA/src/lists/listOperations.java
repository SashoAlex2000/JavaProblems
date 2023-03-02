package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"End".equals(line)) {

            String [] shredded = line.split(" ");
            String command = shredded[0];

            if ("Add".equals(command)) {
                numbers.add(Integer.parseInt(shredded[1]));
            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(shredded[2]);

                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");;
                } else {
                    numbers.add(index, Integer.parseInt(shredded[1]));
                }
            } else if ("Remove".equals(command)) {
                int index = Integer.parseInt(shredded[1]);

                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }
            } else if ("Shift".equals(command)) {

                int count = Integer.parseInt(shredded[2]);

                if ("left".equals(shredded[1])) {

                    for (int i = 0; i < count; i++) {

                        int removedNum = numbers.remove(0);
                        numbers.add(removedNum);

                    }

                } else {
                    for (int i = 0; i < count; i++) {

                        int removedNum = numbers.remove(numbers.size() - 1);
                        numbers.add(0, removedNum);

                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
