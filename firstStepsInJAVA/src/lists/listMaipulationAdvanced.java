package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listMaipulationAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbers = new java.util.ArrayList<>(Arrays
                .stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e)).boxed().collect(Collectors.toList()));

        String line = scanner.nextLine();

        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");
            String command = shredded[0];

            if ("Contains".equals(command)) {

                int number = Integer.parseInt(shredded[1]);
                if (!numbers.contains(number)) {
                    System.out.println("No such number");
                }else {
                    System.out.println("Yes");
                }

            } else if ("Print".equals(command)) {

                if ("even".equals(shredded[1])) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                } else {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                }
                System.out.printf("\n");
            } else if ("Get".equals(command)) {

                int sum = 0;


                for (int i = 0; i < numbers.size(); i++) {
                    sum += numbers.get(i);
                }

                System.out.println(sum);
            } else if ("Filter".equals(command)) {

                String cond = shredded[1];
                int compar = Integer.parseInt(shredded[2]);
//                List<Integer> result = new ArrayList<>();

                for (int i = 0; i < numbers.size(); i++) {

                    int currentNum = numbers.get(i);

                    if (">".equals(cond)) {
                        if (currentNum > compar) {
                            System.out.printf("%d ", currentNum);
                        }
                    } else if (">=".equals(cond)) {
                        if (currentNum >= compar) {
                            System.out.printf("%d ", currentNum);
                        }
                    } else if ("<".equals(cond)) {
                        if (currentNum < compar) {
                            System.out.printf("%d ", currentNum);
                        }
                    } else if ("<=".equals(cond)) {
                        if (currentNum <= compar) {
                            System.out.printf("%d ", currentNum);
                        }
                    }
                }
                System.out.print("\n");
            }
            line = scanner.nextLine();
        }
    }
}
