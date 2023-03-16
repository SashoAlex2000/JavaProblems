package objectsClasses;

import java.util.Scanner;

public class articles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] shredded = scanner.nextLine().split(", ");
        Article currentArticle = new Article(shredded[0], shredded[1], shredded[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] parts = scanner.nextLine().split(": ");
            String command = parts[0];
            String content = parts[1];

            if ("Edit".equals(command)) {
                currentArticle.edit(content);
            } else if ("ChangeAuthor".equals(command)) {
                currentArticle.changeAuthor(content);
            } else {
                currentArticle.rename(content);
            }
        }

        System.out.print(currentArticle);

    }

    public static class Article {

        private String title;
        private String content;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void  edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.setAuthor(newAuthor);
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        public String toString () {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        private String author;

    }

}
