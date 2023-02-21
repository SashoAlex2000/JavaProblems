package conditionalStatements.exercise;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {

        double PUZZLE_PRICE = 2.6;
        double DOLL = 3;
        double TEDDY_BEAR = 4.1;
        double MINION = 8.2;
        double TOY_TRUCK = 2;

        Scanner scanner = new Scanner(System.in);
        double needed_excursion_money = Double.parseDouble(scanner.nextLine());
        int number_of_puzzles = Integer.parseInt(scanner.nextLine());
        int number_of_dolls = Integer.parseInt(scanner.nextLine());
        int number_of_teddy_bears = Integer.parseInt(scanner.nextLine());
        int number_of_minions = Integer.parseInt(scanner.nextLine());
        int number_of_trucks = Integer.parseInt(scanner.nextLine());

        double total_revenue = PUZZLE_PRICE * number_of_puzzles + DOLL * number_of_dolls +
                TEDDY_BEAR * number_of_teddy_bears + MINION * number_of_minions + TOY_TRUCK * number_of_trucks;

        double discount = 0;

        if ((number_of_puzzles + number_of_dolls + number_of_teddy_bears + number_of_minions + number_of_trucks) >= 50) {
            discount = 0.25;
        }
        
        total_revenue = total_revenue * (1 - discount);

        total_revenue *= 0.9;

        double difference = total_revenue - needed_excursion_money;

        if (difference >= 0) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference*-1);
        }


    }
}
