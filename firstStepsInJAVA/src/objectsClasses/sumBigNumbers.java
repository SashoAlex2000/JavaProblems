package objectsClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class sumBigNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());

        BigInteger sum = first.add(second);
        System.out.print(sum);

    }

}
