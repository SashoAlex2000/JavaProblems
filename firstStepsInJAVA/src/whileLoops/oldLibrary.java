package whileLoops;

import java.util.Scanner;

public class oldLibrary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int totalBooksLooked = 0;

        while (true) {

            String currentBook = scanner.nextLine();

            if ("No More Books".equals(currentBook)) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", totalBooksLooked);
                break;
            }

            if (searchedBook.equals(currentBook)) {
                System.out.printf("You checked %d books and found it.", totalBooksLooked);
                break;
            }

            totalBooksLooked++;


        }

    }
}
