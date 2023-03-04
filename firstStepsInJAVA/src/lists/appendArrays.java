package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appendArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arrayOfStringArrays = scanner.nextLine().split("\\|");

        List<Integer> result = new ArrayList<>();

        for (int i = arrayOfStringArrays.length - 1; i >=0; i--) {

            String currentMetaString = arrayOfStringArrays[i];

            String [] arr = currentMetaString.split(" ");

            for (int j = 0; j < arr.length; j++) {

                String currentChar = arr[j].trim();
                if (!currentChar.equals("")) {
                    result.add(Integer.parseInt(currentChar));
                }

            }

        }

        System.out.println(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));

    }

}
