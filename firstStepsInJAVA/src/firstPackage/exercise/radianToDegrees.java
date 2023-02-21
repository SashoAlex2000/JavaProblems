package firstPackage.exercise;

import java.util.Scanner;

public class radianToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / pi;
        System.out.println(degrees);
    }
}
