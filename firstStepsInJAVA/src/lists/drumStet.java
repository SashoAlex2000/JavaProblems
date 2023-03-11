package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class drumStet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());

        List<Integer> drums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> initial = new ArrayList<>(drums);
        List<Integer> removedNumbers = new ArrayList<>();

        String line = scanner.nextLine();

        while (!"Hit it again, Gabsy!".equals(line)) {

            int currentNum = Integer.parseInt(line);

            drums.replaceAll(integer -> integer - currentNum);

            for (int i = 0; i < drums.size(); i++) {

                if (removedNumbers.contains(i)) {
                    continue;
                }

                if (drums.get(i) <= 0) {
                    int currentCost = initial.get(i) * 3;
                    if (currentCost <= money) {
                        money -= currentCost;
                        drums.set(i, initial.get(i));
                    } else {
                        removedNumbers.add(i);
                    }
                }

            }
            line = scanner.nextLine();
        }

        for (int i = 0; i < drums.size(); i++) {
            if (!removedNumbers.contains(i)) {
                System.out.printf("%d ", drums.get(i));
            }
        }
        System.out.print("\n");
        System.out.printf("%.2f", money);
    }
}
