package condtionalStatementsAdvanced;

import java.util.Scanner;

public class movieTheater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfTicket = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * cols;

        double ticketPrice = -1;

        if ("Premiere".equals(typeOfTicket)) {
            ticketPrice = 12;
        } else if ("Normal".equals(typeOfTicket)) {
            ticketPrice = 7.5;
        } else if ("Discount".equals(typeOfTicket)) {
            ticketPrice = 5;
        }

        double totalRevenue = totalSeats * ticketPrice;

        System.out.printf("%.2f leva", totalRevenue);
    }

}
