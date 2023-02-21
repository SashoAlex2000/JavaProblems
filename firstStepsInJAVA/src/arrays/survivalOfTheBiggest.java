package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class survivalOfTheBiggest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        List<String> excludedNums = new ArrayList<>();

        int numbersToRemove = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersToRemove; i++) {

            int min = Integer.MAX_VALUE;
            int minNumPos = -1;

            for (int j = 0; j < arr.length; j++) {

                if (!excludedNums.contains(String.valueOf(arr[j]))) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minNumPos = j;
                    }
                }

            }

            excludedNums.add(String.valueOf(arr[minNumPos]));

        }

        String [] arrExlcluded = new String [numbersToRemove];

        arrExlcluded = excludedNums.toArray(new String[excludedNums.size()]);
//        System.out.println(Arrays.toString(new List[]{excludedNums}));
        System.out.println(Arrays.toString(arrExlcluded));

        String [] finalArray = new String [arr.length - numbersToRemove];
        List<String> finalList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!excludedNums.contains(String.valueOf(arr[i]))) {
                finalList.add(String.valueOf(arr[i]));
            }

        }
        finalArray = finalList.toArray(new String[finalList.size()]);
        System.out.println(Arrays.toString(finalArray));
    }

}
