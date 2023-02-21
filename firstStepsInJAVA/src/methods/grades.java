package methods;

import java.util.Scanner;

public class grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        String quantifer = wordQualifierForGrade(grade);

        System.out.printf("%s %.2f\n", quantifer, grade);

        int someNum = Integer.parseInt(scanner.nextLine());
        String message = determinePositivity(someNum);

        System.out.println(message);


    }


    private static String wordQualifierForGrade(double grade) {

        String qualifer = "";

        if (grade <= 2.99) {
            qualifer = "Fail";
        } else if (grade > 2.99 && grade < 3.5) {
            qualifer = "Mid";
        } else if (grade >= 3.50 && grade < 4.5) {
            qualifer = "Good";
        } else if (grade >= 4.50 && grade < 5.5) {
            qualifer = "Very Good";
        } else if (grade >= 5.50) {
            qualifer = "Excellent!";
        }

        return qualifer;

    }

    private static String determinePositivity(int number) {

        String deter = "";

        if (number > 0) {
            deter = "positive";
        } else if (number < 0) {
            deter = "negative";
        } else {
            deter = "zero";
        }

        String message = "The number " + number + " is " + deter +".";
        return message;

    }


}
