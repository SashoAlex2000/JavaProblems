package arrays;

import java.util.Scanner;

public class breadFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split("\\|");
        int coins = 100;
        int energy = 100;
        boolean failed = false;

        for (int i = 0; i < arr.length; i++) {

            String [] shredded = arr[i].split("-");

            String command = shredded[0];
            int number = Integer.parseInt(shredded[1].trim());

            if ("rest".equals(command)) {
                int initialEnergy = energy;
                energy += number;

                if (energy > 100) {
                    energy = 100;
                }

                System.out.printf("You gained %d energy.\n", energy - initialEnergy);
                System.out.printf("Current energy: %d.\n", energy);

            } else if ("order".equals(command)) {
                if (energy >= 30) {
                    energy -= 30;
                    coins += number;
                    System.out.printf("You earned %d coins.\n", number);
                } else {
                    energy += 50;
                    System.out.println("You had to rest!");
                }
            } else {
                if (coins >= number) {
                    coins -= number;
                    System.out.printf("You bought %s.\n", command);
                } else {
                    System.out.printf("Closed! Cannot afford %s.\n", command);
                    failed = true;
                    break;
                }
            }

        }

        if (!failed) {
            System.out.println("Day completed!");
            System.out.printf("Coins: %d\n", coins);
            System.out.printf("Energy: %d\n", energy);
        }



    }

}
