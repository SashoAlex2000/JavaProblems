package condtionalStatementsAdvanced;

import java.util.Scanner;

public class switchBanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String food = scanner.nextLine();

        switch (food) {
            case "banana":
            case "apple":
            case "orange":
            case "pear":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "courgette":
            case "aubergine":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown ;/");
                break;
        }

    }
}
