package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class searchArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String searchedString = scanner.nextLine();

        String [] arr = new String [n];

        for (int i = 0; i < n; i++) {

            String currentSentence = scanner.nextLine();
            arr[i] = currentSentence;

        }

        System.out.println(Arrays.toString(arr));

        String [] filteredArray = findWordInSentence(arr, searchedString);

        System.out.print(Arrays.toString(filteredArray));

    }

    public static String [] findWordInSentence(String[] arrayOfSentences, String luckyString) {

        String [] filteredArr = new String[arrayOfSentences.length];
        int wordsFound = 0;

        for (int i = 0; i < arrayOfSentences.length; i++) {
            String currentSentenceString = arrayOfSentences[i];
            String [] currentSentence = currentSentenceString.split(" ");
            for (String temp :currentSentence) {
                if (temp.equals(luckyString)) {
                    filteredArr[i] = currentSentenceString;
                    break;
                }
            }
        }

        List<String> list = new ArrayList<>();

        for (String str : filteredArr) {
            if (str != null && str.length() > 0) {
                list.add(str);
            }
        }

        filteredArr = list.toArray(new String[list.size()]);

        return filteredArr;

    }

}
