package conditionalStatements.lab;

import java.util.Scanner;

public class areOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = 1;
        String typeOfFigure = scanner.nextLine();
        System.out.println(typeOfFigure);

        switch (typeOfFigure) {
            case "square" -> {
                double side = Double.parseDouble(scanner.nextLine());
                area = side * side;
            }
            case "rectangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
            }
            case "triangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double ha = Double.parseDouble(scanner.nextLine());
                area = a * ha / 2;
            }
            case "circle" -> {
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * Math.pow(radius, 2);
            }
        }

        System.out.printf("%.3f", area);
//        System.out.println("Test" == "Test");
//        System.out.println("Test".equals("Test"));

    }
}
