package firstPackage.lab;

import java.util.Scanner;

public class greetingByName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
