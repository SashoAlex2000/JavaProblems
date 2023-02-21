package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).
                collect(Collectors.toList());

        boolean hasEquals = false;

        while (true) {

            hasEquals = false;

            for (int i = 0; i < numbers.size() - 1; i++) {
                if (Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                    hasEquals = true;
                    double sum = numbers.get(i) + numbers.get(i+1);
                    numbers.remove(i);
                    numbers.remove(i);
                    numbers.add(i, sum);
                    break;
                }
            }
//            System.out.println(numbers);
            if (!hasEquals) {
                break;
            }
        }

        System.out.println(numbers);

    }
}
