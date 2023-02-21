package firstPackage.exercise;

import java.util.Scanner;

public class usdToBgn {
    public static void main(String[] args) {

        double USD_TO_BGN_EXCHANGE_RATE = 1.79549;
        Scanner scanner = new Scanner(System.in);
        double usdForConversion = Double.parseDouble(scanner.nextLine());
        double result = usdForConversion * USD_TO_BGN_EXCHANGE_RATE;

        System.out.println(result);

    }
}
