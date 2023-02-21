package condtionalStatementsAdvanced;

import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = -1;

        if ("Sofia".equals(city)) {
            if (0 <= sales && sales <=500) {
                commission = 0.05;
            } else if (500 < sales && sales <=1000) {
                commission = 0.07;
            } else if (1000 < sales && sales <= 10000) {
                commission = 0.08;
            } else if (sales > 10000) {
                commission = 0.12;
            }
        } else if ("Varna".equals(city)) {
            if (0 <= sales && sales <=500) {
                commission = 0.045;
            } else if (500 < sales && sales <=1000) {
                commission = 0.075;
            } else if (1000 < sales && sales <= 10000) {
                commission = 0.1;
            } else if (sales > 10000) {
                commission = 0.13;
            }
        } else if ("Plovdiv".equals(city)) {
            if (0 <= sales && sales <=500) {
                commission = 0.055;
            } else if (500 < sales && sales <=1000) {
                commission = 0.08;
            } else if (1000 < sales && sales <= 10000) {
                commission = 0.12;
            } else if (sales > 10000) {
                commission = 0.145;
            }
        }

        if (commission < 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", sales * commission);
        }

    }
}
