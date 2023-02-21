package forCycles;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstGroupCount = 0;
        int secondGroupCount = 0;
        int thirdGroupCount = 0;
        int fourthGroupCount = 0;
        int fifthGroupCount = 0;
        int totalNumbers = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i=1; i <=n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            totalNumbers += 1;
            System.out.println(currentNum);

            if (currentNum < 200) {
                firstGroupCount += 1;
            } else if (currentNum <= 399) {
                secondGroupCount += 1;
            } else if (currentNum <= 599) {
                thirdGroupCount += 1;
            } else if (currentNum <= 799) {
                fourthGroupCount += 1;
            } else if (currentNum >= 800) {
                fifthGroupCount += 1;
            }

        }

        System.out.println(firstGroupCount);
        System.out.println(totalNumbers);

        double firstPercentage = firstGroupCount *1.0 / totalNumbers * 100;
        double secondPercentage = secondGroupCount *1.0 / totalNumbers * 100;
        double thirdPercentage = thirdGroupCount *1.0 / totalNumbers * 100;
        double fourthPercentage = fourthGroupCount *1.0 / totalNumbers * 100;
        double fifthPercentage = fifthGroupCount *1.0 / totalNumbers * 100;

        System.out.printf("%.2f\n", firstPercentage);
        System.out.printf("%.2f\n", secondPercentage);
        System.out.printf("%.2f\n", thirdPercentage);
        System.out.printf("%.2f\n", fourthPercentage);
        System.out.printf("%.2f\n", fifthPercentage);


    }
}
