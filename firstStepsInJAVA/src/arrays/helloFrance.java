package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class helloFrance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split("\\|");
        double budget = Double.parseDouble(scanner.nextLine());
        double totalProfit = 0;
        double finalMoney = budget;

        List<Double> itemsBought = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            String [] shredded = arr[i].split("->");
            double currentPrice = Double.parseDouble(shredded[1]);

            if (currentPrice <= budget) {
                budget -= currentPrice;

                double newPrice = currentPrice * 1.4;
                totalProfit += currentPrice * 0.4;

                itemsBought.add(newPrice);
            }


        }

        finalMoney += totalProfit;
//        System.out.println(Arrays.toString(new List[]{itemsBought}));
//        System.out.println(totalProfit);
//        System.out.println(finalMoney);

//        double [] finalBoughtItemsArray = new double[itemsBought.size()];
        Object[] finalBoughtItemsArray = new double[][]{new double[itemsBought.size()]};
        System.out.println(Arrays.toString(finalBoughtItemsArray));
        finalBoughtItemsArray = itemsBought.toArray();
        System.out.println(Arrays.toString(finalBoughtItemsArray));


    }

}
