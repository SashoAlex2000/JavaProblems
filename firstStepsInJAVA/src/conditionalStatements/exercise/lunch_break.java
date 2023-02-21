package conditionalStatements.exercise;

import java.util.Scanner;

public class lunch_break {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name_of_tv_series = scanner.nextLine();
        int episode_length = Integer.parseInt(scanner.nextLine());
        double lunch_break_length = Double.parseDouble(scanner.nextLine());

        lunch_break_length = lunch_break_length * 5 / 8;

        double difference = lunch_break_length - episode_length;

        if (difference >=0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name_of_tv_series, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name_of_tv_series, Math.ceil(difference*-1));
        }

    }

}
