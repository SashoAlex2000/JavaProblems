package condtionalStatementsAdvanced;

import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = -1;

        if ("Sofia".equals(city)) {
            if ("coffee".equals(productName)) {
                price = 0.5;
            } else if ("water".equals(productName)) {
                price = 0.8;
            } else if ("beer".equals(productName)) {
                price = 1.2;
            } else if ("sweets".equals(productName)) {
                price = 1.45;
            } else if ("peanuts".equals(productName)) {
                price = 1.6;
            }
        } else if ("Plovdiv".equals(city)) {
            if ("coffee".equals(productName)) {
                price = 0.4;
            } else if ("water".equals(productName)) {
                price = 0.7;
            } else if ("beer".equals(productName)) {
                price = 1.15;
            } else if ("sweets".equals(productName)) {
                price = 1.3;
            } else if ("peanuts".equals(productName)) {
                price = 1.5;
            }
        } else if ("Varna".equals(city)) {
            if ("coffee".equals(productName)) {
                price = 0.45;
            } else if ("water".equals(productName)) {
                price = 0.7;
            } else if ("beer".equals(productName)) {
                price = 1.1;
            } else if ("sweets".equals(productName)) {
                price = 1.35;
            } else if ("peanuts".equals(productName)) {
                price = 1.55;
            }
        }

        double totalPrice = price * quantity;

        System.out.printf("%.1f", totalPrice);

    }
}
