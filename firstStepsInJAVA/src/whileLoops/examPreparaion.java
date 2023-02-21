package whileLoops;

import java.util.Scanner;

public class examPreparaion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int allowedUnsatisfactoryMarks = Integer.parseInt(scanner.nextLine());
        int totalProblemsNumber = 0;
        int sumOfGrades = 0;

        int receivedBadMarks = 0;
        String metaProblem = "";

        while (true) {

            String currentProblem = scanner.nextLine();

            if ("Enough".equals(currentProblem)) {
                double averageScore = sumOfGrades * 1.00 / totalProblemsNumber;
                System.out.printf("Average score: %.2f\n",averageScore);
                System.out.printf("Number of problems: %d\n", totalProblemsNumber);
                System.out.printf("Last problem: %s\n", metaProblem);
                break;
            }

            metaProblem = currentProblem;

            int currentGrade = Integer.parseInt(scanner.nextLine());

            totalProblemsNumber++;
            sumOfGrades += currentGrade;

            if (currentGrade <= 4) {
                receivedBadMarks++;
            }

            if (receivedBadMarks >= allowedUnsatisfactoryMarks) {
                System.out.printf("You need a break, %d poor grades.", receivedBadMarks);
                break;
            }

        }

    }

}
