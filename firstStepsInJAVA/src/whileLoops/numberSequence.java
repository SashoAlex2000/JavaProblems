package whileLoops;

import java.util.Scanner;

public class numberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int difference = 2;
        int currentNum = 1;

        while (true) {

            if (currentNum > n) {
                break;
            }

            System.out.println(currentNum);
            currentNum += difference;
            difference*=2;

        }


    }

}
