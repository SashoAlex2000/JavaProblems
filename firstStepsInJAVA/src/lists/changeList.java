package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");

            String command = shredded[0];

            if ("Delete".equals(command)) {
                numbers.removeIf(e -> e==Integer.parseInt(shredded[1]));
            } else {
                numbers.add(Integer.parseInt(shredded[2]),Integer.parseInt(shredded[1]));
            }

            line = scanner.nextLine();

        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

}
