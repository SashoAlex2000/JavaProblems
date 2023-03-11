package objectsClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class factorialBigNums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger sum = new BigInteger("1");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        System.out.print(sum);
    }

}
