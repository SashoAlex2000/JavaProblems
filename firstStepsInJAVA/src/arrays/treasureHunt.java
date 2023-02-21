package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class treasureHunt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split("\\|");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        String line = scanner.nextLine();

        while (!"Yohoho!".equals(line)) {

            String [] shredded = line.split(" ");
            String command = shredded[0];

            if ("Loot".equals(command)) {

                for (int i = 1; i < shredded.length; i++) {
                    String currentItem = shredded[i];

                    if (!list.contains(currentItem)) {
                        list.add(0, currentItem);
                    }

                }

            } else if ("Drop".equals(command)) {

                int index = Integer.parseInt(shredded[1]);

                if (index >= 0 && index < arr.length) {
                    String element = list.remove(index);
                    list.add(element);
                }

            } else if ("Steal".equals(command)) {

                int countOfStoleItems = Integer.parseInt(shredded[1]);

                if (countOfStoleItems >= list.size()) {

                    for (int i = 0; i < list.size(); i++) {
                        if (i != countOfStoleItems - 1) {
                            System.out.printf("%s, ", list.get(i));
                        } else {
                            System.out.printf("%s\n", list.get(i));
                        }
                    }

                    list.clear();
                } else {

                    for (int i = 0; i < countOfStoleItems; i++) {

                        String removedItem = list.remove(list.size() - 1);
                        if (i != countOfStoleItems - 1) {
                            System.out.printf("%s, ", removedItem);
                        } else {
                            System.out.printf("%s\n", removedItem);
                        }

                    }

                }

            }
//            System.out.println(list);
            line = scanner.nextLine();

        }

        if (list.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {

            int totalSum = 0;

            for (int i = 0; i < list.size(); i++) {
                String currentItem = list.get(i);
                totalSum += currentItem.length();
            }

            double averageGain = totalSum*1.00 / list.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);

        }

    }

}
