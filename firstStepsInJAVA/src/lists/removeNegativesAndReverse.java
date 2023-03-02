package lists;

import java.util.*;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> listOFNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        listOFNumbers.removeIf(n -> n < 0);
        Collections.reverse(listOFNumbers);

        if (listOFNumbers.isEmpty()) {
            System.out.print("empty");
        } else {
            System.out.println(listOFNumbers.toString().replaceAll("[\\[\\],]", ""));
        }


    }

}
