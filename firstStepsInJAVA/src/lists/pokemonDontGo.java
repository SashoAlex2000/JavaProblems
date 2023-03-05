package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int totalPoints = 0;

        while (numbers.size() > 0) {

            int currentIndex = Integer.parseInt(scanner.nextLine());
            int removedNumber = 0;

            if (currentIndex < 0) {
                removedNumber = numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
            } else if (currentIndex >= numbers.size()) {
                removedNumber = numbers.remove(numbers.size() - 1);
                numbers.add(numbers.size(), numbers.get(0));
            } else {
                removedNumber = numbers.remove(currentIndex);
            }

            totalPoints += removedNumber;

            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) <= removedNumber) {
                    int newValue = numbers.get(i) + removedNumber;
                    numbers.remove(i);
                    numbers.add(i, newValue);
                } else {
                    int newValue = numbers.get(i) - removedNumber;
                    numbers.remove(i);
                    numbers.add(i, newValue);
                }

            }
            System.out.println(totalPoints);
            System.out.println(numbers);

        }

        System.out.print(totalPoints);

    }

}
