package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class messaging {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List <String> sentence = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        List <String> secretMessage = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i ++) {

            String currentNumber = numbers.get(i);
            int currentSum = 0;

            for (int j = 0; j < currentNumber.length(); j++) {
                currentSum += Integer.parseInt(String.valueOf(currentNumber.charAt(j)));
            }

            if (currentSum > sentence.size()) {
                currentSum = currentSum - (sentence.size() * (currentSum / sentence.size()));
            }


            String removedChar = sentence.remove(currentSum);
            secretMessage.add(removedChar);

        }
    }
}
