package firstPackage.lab;

import java.util.Scanner;

public class inchToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inches = Integer.parseInt(sc.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
