package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opinionPoll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String [] shredded = scanner.nextLine().split(" ");
            Person currentPerson = new Person();

            currentPerson.setName(shredded[0]);
            currentPerson.setAge(Integer.parseInt(shredded[1]));
            people.add(currentPerson);

        }

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.print(person + "\n");
            }
        }

    }

    public static class Person {

        String name;
        int age;

        public String toString () {
            return String.format("%s - %d", this.name, this.age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
