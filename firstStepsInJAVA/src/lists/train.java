package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        int MAX_CAPACITY = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");

            if (shredded.length > 1) {

                numbers.add(Integer.parseInt(shredded[1]));

            } else {

                for (int i = 0; i < numbers.size(); i++) {

                    int currentNum = Integer.parseInt(shredded[0]);
                    if (numbers.get(i) <= MAX_CAPACITY && numbers.get(i) + currentNum <= MAX_CAPACITY) {
                        int sum = numbers.get(i) + currentNum;
                        numbers.set(i, sum);
                        break;
                    }

                }

            }

            line = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }

}
