package firstPackage.exercise;

import java.util.Scanner;

public class depositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumDeposited = Double.parseDouble(scanner.nextLine());
        double months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double monthlyInterestAccrued = interestRate / 100 / 12 * sumDeposited;
        double totalAccruedInterest = monthlyInterestAccrued * months;

        System.out.println(sumDeposited + totalAccruedInterest);

    }

}
