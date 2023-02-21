package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class easternGifts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");

        System.out.println(Arrays.toString(arr));

        String input = scanner.nextLine();

        while (!"No Money".equals(input)) {

            String [] shredded = input.split(" ");

            String command = shredded[0];

            if ("OutOfStock".equals(command)) {

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i].equals(shredded[1])) {
                        arr[i] = "None";
                    }

                }

            }else if ("Required".equals(command)) {
                int index = Integer.parseInt(shredded[2]);

                if (index > 0 && index < arr.length) {
                    arr[index] = shredded[1];
                }

            } else if ("JustInCase".equals(command))
            {
                arr[arr.length-1] = shredded[1];
            }

            System.out.println(Arrays.toString(arr));
            input = scanner.nextLine();

        }

        for (int i = 0; i < arr.length; i++)
        {
            if (!"None".equals(arr[i]))
            {
                System.out.printf("%s ", arr[i]);
            }
        }


    }


}
