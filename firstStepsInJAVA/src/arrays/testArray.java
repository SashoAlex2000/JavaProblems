package arrays;

import java.util.Scanner;

public class testArray {
    public static void main(String[] args) {
        String [] weekdaysArray = {"Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday","Sunday"};

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0 || n > 7) {
            System.out.println("Invalid Day!");
        } else {
            System.out.println(weekdaysArray[n-1]);
        }
    }
}
