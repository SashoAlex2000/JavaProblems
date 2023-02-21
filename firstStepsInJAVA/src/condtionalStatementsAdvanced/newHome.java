package condtionalStatementsAdvanced;

import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        double ROSE_PRICE = 5;
        double DALIUM_PRICE = 3.8;
        double TULIP_PRICE = 2.8;
        double NARCISSUS_PRICE = 3;
        double GLADIOLA_PRICE = 2.5;

        Scanner scanner = new Scanner(System.in);

        String typeOfFlower = scanner.nextLine();
        int numberOfFLowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = -1;
        double priceMultiplier = 1;

        if ("Roses".equals(typeOfFlower)){
            price = ROSE_PRICE;
            if (numberOfFLowers > 80) {
                priceMultiplier = 0.9;
            }
        } else if ("Dahlias".equals(typeOfFlower)) {
            price = DALIUM_PRICE;
            if (numberOfFLowers > 90) {
                priceMultiplier = 0.85;
            }
        } else if ("Tulips".equals(typeOfFlower)) {
            price = TULIP_PRICE;
            if (numberOfFLowers > 80) {
                priceMultiplier = 0.85;
            }
        } else if ("Narcissus".equals(typeOfFlower)) {
            price = NARCISSUS_PRICE;
            if (numberOfFLowers < 120) {
                priceMultiplier = 1.15;
            }
        } else if ("Gladiolus".equals(typeOfFlower)) {
            price = GLADIOLA_PRICE;
            if (numberOfFLowers < 80) {
                priceMultiplier = 1.2;
            }
        }

        double totalPrice = numberOfFLowers * price * priceMultiplier;

        double difference = budget - totalPrice;

        if (difference >= 0) {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", numberOfFLowers, typeOfFlower, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference*-1);
        }

    }
}
