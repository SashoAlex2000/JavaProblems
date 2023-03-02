package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] shredded = scanner.nextLine().split(" ");

            String name = shredded[0];

            if (shredded.length == 3) {

                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!\n", name);
                }

            } else {

                if (!guests.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                } else {
                    guests.remove(name);
                }

            }

        }

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }

    }

}
