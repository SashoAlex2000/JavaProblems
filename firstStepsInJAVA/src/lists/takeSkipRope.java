package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class takeSkipRope {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        List<String> initial = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String initial = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < initial.length(); i++) {

            char currentChar = initial.charAt(i);

            if (Character.isDigit(currentChar)) {
                numbers.add(Integer.parseInt(String.valueOf(currentChar)));
            } else {
                words.add(String.valueOf(currentChar));
            }

        }

        List<Integer> takeNums = new ArrayList<>();
        List<Integer> skipNums = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if (i % 2 == 0) {
                takeNums.add(currentNum);
            } else {
                skipNums.add(currentNum);
            }

        }

        int counter = 0;

        for (int i = 0; i < takeNums.size(); i++) {

            int currentTakeNum = takeNums.get(i);
            int currentSkipNum = skipNums.get(i);

            if (currentTakeNum > 0) {
                for (int j = 0; j < currentTakeNum; j++) {
                    if (counter < words.size()) {
                        result.add(words.get(counter));
                    }

                    counter++;
                }
            }

            counter += currentSkipNum;

        }

        System.out.print(result);

    }

}
