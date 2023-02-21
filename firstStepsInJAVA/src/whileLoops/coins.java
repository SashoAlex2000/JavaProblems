package whileLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int coinsUsed = 0;

        while (sum > 0) {

            System.out.println(sum);

            sum = sum * 100 / 100;
            if (sum < 0.01) {
                if (sum > 0) {
                    coinsUsed += 1;
                }
                break;
            }

            if (sum >= 2) {
                coinsUsed += 1;
                sum-=2;
            } else if (sum < 2 && sum >= 1) {
                coinsUsed += 1;
                sum -= 1;
            }else if (sum < 1 && sum >= 0.5) {
                coinsUsed += 1;
                sum -= 0.50;
            } else if (sum >= 0.2) {
                coinsUsed += 1;
                sum -= 0.20;
            } else if (sum < 0.2 && sum >= 0.1) {
                coinsUsed += 1;
                sum -= 0.1;
            } else if (sum < 0.1 && sum >= 0.05) {
                coinsUsed += 1;
                sum -= 0.05;
            } else if (sum < 0.05 && sum >= 0.02) {
                coinsUsed += 1;
                sum -= 0.02;
            } else if (sum == 0.01) {
                coinsUsed += 1;
                sum -= 0.01;
            }

            sum = sum * 100 / 100;

        }

        System.out.println(coinsUsed);

    }

}
