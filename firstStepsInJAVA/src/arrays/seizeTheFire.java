package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class seizeTheFire {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        String [] arr = input.split("#");
        int water = Integer.parseInt(scanner.nextLine());
        float effortExerted = 0;
        int firePutOut = 0;
        List<String> listFiresPutOut = new ArrayList<>();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            String [] shredded = arr[i].split(" = ");

            String category = shredded[0];
            int firePower = Integer.parseInt(shredded[1]);

            if ("High".equals(category)) {
                if (81 <= firePower && firePower <= 125) {
                    if (water >= firePower) {
                        water -= firePower;
                        effortExerted += 0.25 * firePower;
                        firePutOut += firePower;
                        listFiresPutOut.add(String.valueOf(firePower));
                    }
                }
            } else if ("Medium".equals(category)) {
                if (51 <= firePower && firePower <= 80) {
                    if (water >= firePower) {
                        water -= firePower;
                        effortExerted += 0.25 * firePower;
                        firePutOut += firePower;
                        listFiresPutOut.add(String.valueOf(firePower));
                    }
                }
            } else if ("Low".equals(category)) {
                if (1 <= firePower && firePower <= 50) {
                    if (water >= firePower) {
                        water -= firePower;
                        effortExerted += 0.25 * firePower;
                        firePutOut += firePower;
                        listFiresPutOut.add(String.valueOf(firePower));
                    }
                }
            }


        }

        System.out.println(firePutOut);
        System.out.println(effortExerted);

    }

}
