package condtionalStatementsAdvanced;

import java.util.Scanner;

public class hotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double studioPrice = -1;
        double apartmentPrice = -1;

        double studioDiscount = 0;
        double apartmentDiscount = 0;

        if ("May".equals(month) || "October".equals(month)) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (numberOfNights > 7 && numberOfNights <= 14) {
                studioDiscount = 0.05;
            } else if (numberOfNights > 14) {
                studioDiscount = 0.30;
            }
        } else if ("June".equals(month) || "September ".equals(month)) {
            studioPrice = 75.2;
            apartmentPrice = 68.7;
            if (numberOfNights > 14) {
                studioDiscount = 0.20;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            studioPrice = 76;
            apartmentPrice = 77;
        }

        if (numberOfNights > 14) {
            apartmentDiscount = 0.1;
        }

        studioPrice = studioPrice * (1 - studioDiscount);
        apartmentPrice = apartmentPrice * (1 - apartmentDiscount);

        double totalStudioPrice = studioPrice * numberOfNights;
        double totalApartmentPrice = apartmentPrice * numberOfNights;

        System.out.printf("Apartment: %.2f lv.\n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);

    }

}
