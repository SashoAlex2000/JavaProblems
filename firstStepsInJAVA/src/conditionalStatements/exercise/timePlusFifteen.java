package conditionalStatements.exercise;

import java.util.Scanner;

public class timePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + minutes;

        totalMinutes += 15;

        int newHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHour >= 24) {
            newHour -= 24;
        }

        if (newMinutes < 10) {
            System.out.printf("%d:0%d", newHour, newMinutes);
        } else {
            System.out.printf("%d:%d", newHour, newMinutes);

        }

    }
}
