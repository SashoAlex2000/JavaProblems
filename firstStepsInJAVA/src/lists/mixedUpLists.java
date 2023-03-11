package lists;

import java.util.*;
import java.util.stream.Collectors;

public class mixedUpLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> combined = new ArrayList<>();

        int interLength = Math.min(firstList.size(), secondList.size());

        for (int i =0; i < interLength; i++) {

            combined.add(firstList.get(i));
            combined.add(secondList.get(secondList.size() - 1- i));

        }

        int lesserSpecialNum;
        int greaterSpecialNum;

        if (firstList.size() > secondList.size()) {
            int currSize = firstList.size();
            lesserSpecialNum = Math.min(firstList.get(currSize -1), firstList.get(currSize -2));
            greaterSpecialNum = Math.max(firstList.get(currSize -1), firstList.get(currSize -2));
        } else {
            lesserSpecialNum = Math.min(secondList.get(0), secondList.get(1));
            greaterSpecialNum = Math.max(secondList.get(0), secondList.get(1));
        }

        List<Integer> result = new ArrayList<>();

        for (Integer integer : combined) {
            if (integer > lesserSpecialNum && integer < greaterSpecialNum) {
                result.add(integer);
            }
        }

        Collections.sort(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));

    }

}
