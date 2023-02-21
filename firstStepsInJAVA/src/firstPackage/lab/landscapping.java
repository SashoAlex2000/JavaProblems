package firstPackage.lab;

import java.util.Scanner;

public class landscapping {
    public static void main(String[] args) {
        double PRICE_PER_SQ_METER = 7.61;
        int DISCOUNT_IN_PERCENTAGE = 18;

        Scanner scanner = new Scanner(System.in);

        int squareMeterToBeDone = Integer.parseInt(scanner.nextLine());

        double priceBeforeDiscount = squareMeterToBeDone * PRICE_PER_SQ_METER;
        double discount = priceBeforeDiscount * DISCOUNT_IN_PERCENTAGE / 100;
        double finalPrice = priceBeforeDiscount - discount;

        String firstLine = "The final price is: " + finalPrice + " lv.";
        String secondLine = "The discount is: "+  discount +"lv.";

        System.out.println(firstLine);
        System.out.print(secondLine);

    }
}
