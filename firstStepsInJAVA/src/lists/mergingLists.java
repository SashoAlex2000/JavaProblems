package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        List <Integer> result = new ArrayList<>();

        int smaller = Math.min(first.size(), second.size());

        for (int i = 0; i < smaller; i++) {
            int numFromFirst = first.get(i);
            int numFromSecond = second.get(i);

            result.add(numFromFirst);
            result.add(numFromSecond);

        }

        if (first.size() > second.size()) {
            for (int j = smaller; j < first.size();j++) {
                result.add(first.get(j));
            }
        } else {
            for (int j = smaller; j < second.size();j++) {
                result.add(second.get(j));
            }
        }

        System.out.print(result);

    }

}
