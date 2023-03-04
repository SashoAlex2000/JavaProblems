package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        int currentIndex = 0;

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {

            int firstPlayerCurr = firstPlayerCards.get(currentIndex);
            int secondPlayerCurr = secondPlayerCards.get(currentIndex);

            if (firstPlayerCurr > secondPlayerCurr) {
                firstPlayerCards.remove(0);
                firstPlayerCards.add(firstPlayerCurr);
                firstPlayerCards.add(secondPlayerCurr);
                secondPlayerCards.remove(0);
            } else if (secondPlayerCurr > firstPlayerCurr) {
                secondPlayerCards.remove(0);
                secondPlayerCards.add(secondPlayerCurr);
                secondPlayerCards.add(firstPlayerCurr);
                firstPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }

            System.out.println(firstPlayerCards);
            System.out.println(secondPlayerCards);

        }

        System.out.println(firstPlayerCards);
        System.out.println(secondPlayerCards);

        if (firstPlayerCards.size() > 0) {
            System.out.printf("First player wins: %d", firstPlayerCards.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.printf("Second player wins: %d", secondPlayerCards.stream().mapToInt(e -> Integer.parseInt(String.valueOf(e))).sum());
        }

    }

}
