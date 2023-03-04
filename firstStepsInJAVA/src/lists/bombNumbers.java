package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        int [] commands = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int magicNumber = commands[0];
        int power = commands[1];

        while (numbers.contains(magicNumber)) {

            int currentIndex = numbers.indexOf(magicNumber);

            int start = currentIndex - power;
            int end = currentIndex + power;

            numbers = explodeIndex(numbers, currentIndex, power);

        }


        System.out.println(numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.print(sum);

    }

    public static List<Integer> explodeIndex(List<Integer> theList, int index, int explosionPower) {

        int start = Math.max(0, index - explosionPower);
        int end = Math.min(theList.size() - 1, index + explosionPower);
//        System.out.println(index);
//        System.out.println(start);
//        System.out.println(end);
//        System.out.println(theList);

        List <Integer> result = new ArrayList<>();

        for (int i = 0; i < start; i++) {
            result.add(theList.get(i));
        }
        for (int i = end + 1; i <= theList.size() - 1; i++) {
            result.add(theList.get(i));
        }
//        System.out.println(result);
        return result;

    }

}
