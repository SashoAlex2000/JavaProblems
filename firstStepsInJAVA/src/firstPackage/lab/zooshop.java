package firstPackage.lab;

import java.util.Scanner;

public class zooshop {
    public static void main(String[] args) {
        final double dogFood = 2.5;
        final double catFood = 4;

        Scanner scanner = new Scanner(System.in);

        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        double totalCost = dogFood * dogFoodPackages + catFoodPackages * catFood;

        String result = totalCost + " lv.";

        System.out.println(result);

    }
}
