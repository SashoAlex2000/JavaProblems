package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class carRace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        float leftPlayerSum = 0;
        float rightPlayerSum = 0;

        int numberOfSteps = numbers.size() / 2 - 1;

        for (int i = 0; i <= numberOfSteps; i++) {
            int currentLeftNum = numbers.get(i);
            if (currentLeftNum == 0) {
                leftPlayerSum *= 0.8;
            } else {
              leftPlayerSum += currentLeftNum;
            }

            int currentRightNum = numbers.get(numbers.size() - 1 - i);
            if (currentRightNum == 0) {
                rightPlayerSum *= 0.8;
            } else {
                rightPlayerSum += currentRightNum;
            }

        }

        String winner = leftPlayerSum < rightPlayerSum? "left":"right";
        float winningTime = Math.min(leftPlayerSum, rightPlayerSum);

        System.out.printf("The winner is %s with total time: %.1f", winner, winningTime);

    }

}
