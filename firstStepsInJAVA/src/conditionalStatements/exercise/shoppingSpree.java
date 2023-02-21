package conditionalStatements.exercise;

import java.util.Scanner;

public class shoppingSpree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double video_card_number = Integer.parseInt(scanner.nextLine());
        double processor_number = Integer.parseInt(scanner.nextLine());
        double ram_number = Integer.parseInt(scanner.nextLine());

        double VIDEO_CARD_PRICE = 250;
        double total_video_card_price = VIDEO_CARD_PRICE * video_card_number;
        double total_processor_price = total_video_card_price * 0.35 * processor_number;
        double total_ram_price = 0.1 * total_video_card_price * ram_number;

        System.out.println(total_video_card_price);
        System.out.println(total_processor_price);
        System.out.println(total_ram_price);

        double total_price = total_processor_price + total_video_card_price + total_ram_price;

        double discount = 0;

        if (video_card_number > processor_number) {
            discount = 0.15;
        }

        total_price = total_price * (1-discount);


        System.out.println(total_price);
        double difference = budget - total_price;

        if (difference >=0) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference*-1);
        }

    }
}
