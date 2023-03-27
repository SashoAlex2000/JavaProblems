package objectsClasses;

import java.util.*;

public class orderByAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!"End".equals(line)) {

            String [] shredded = line.split(" ");

            Person currentPerson = new Person(shredded[0], shredded[1], Integer.parseInt(shredded[2]));
            people.add(currentPerson);

            line = scanner.nextLine();
        }

//        Comparator<Person> compareByAge = (Person a, Person b) -> Integer.compare(a.getAge(), b.getAge());
        Comparator<Person> compareByAge = Comparator.comparingInt(Person::getAge);
        Collections.sort(people, compareByAge);

        for (Person person : people) {
            System.out.print(person);
        }

    }

    public static class Person {

        String name;
        String id;
        int age;

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.\n", this.name, this.id, this.age);
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

    }

}
