package methods;

import java.util.Scanner;

public class calculateArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(height, width);

        System.out.print(area);

    }

    private static double getRectangleArea(double a, double b) {

        return a * b;

    }

}
