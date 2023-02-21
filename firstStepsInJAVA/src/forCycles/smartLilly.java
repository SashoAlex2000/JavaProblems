package forCycles;

import java.util.Scanner;

public class smartLilly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int priceOfToy = Integer.parseInt(scanner.nextLine());

        int totalMoneyCollected = 0;
        int currentMoneyForReceiving = 10;

        for (int i = 1; i <=age; i++){
            if (i % 2 != 0) {
                totalMoneyCollected += priceOfToy;
            } else {
                totalMoneyCollected += currentMoneyForReceiving;
                totalMoneyCollected -= 1;
                currentMoneyForReceiving += 10;
            }
        }

        double difference = totalMoneyCollected - washingMachinePrice;

        if (difference >= 0) {
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference*-1);
        }

    }
}
