package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class faroShuffle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");
        int numberOfShuffles = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfShuffles; i++) {

            arr = shuffleDeck(arr);

        }

        System.out.println(Arrays.toString(arr));

    }

    public static String[] shuffleDeck(String[] someArr) {

        int halfLength = someArr.length / 2;

        String [] firstHalf = new String[halfLength];
        String [] secondHalf = new String[halfLength];

        System.arraycopy(someArr, 0, firstHalf, 0, halfLength);
        System.arraycopy(someArr, halfLength, secondHalf, 0, halfLength);

        List<String> finalArr = new ArrayList<>();

        for (int i = 0; i < firstHalf.length; i++) {
            finalArr.add(firstHalf[i]);
            finalArr.add(secondHalf[i]);
        }


        someArr = finalArr.toArray(new String[finalArr.size()]);

        return someArr;

    }

}
