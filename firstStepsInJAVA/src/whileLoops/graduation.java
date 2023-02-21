package whileLoops;

import java.util.Scanner;

public class graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        double sumOfGrades = 0;

        int currentGrade = 1;
        boolean hasFailed = false;


        while (true) {

            double currentMark = Double.parseDouble(scanner.nextLine());

            if (currentMark >= 4.00) {
                sumOfGrades += currentMark;
                currentGrade++;
            } else {
                if (!hasFailed) {
                    hasFailed = true;
                } else {
                    System.out.printf("%s has been excluded at %d grade", studentName, currentGrade);
                    break;
                }
            }

            if (currentGrade == 13) {
                double averageGrade = sumOfGrades / 12;
                System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
                break;
            }


        }

    }

}
