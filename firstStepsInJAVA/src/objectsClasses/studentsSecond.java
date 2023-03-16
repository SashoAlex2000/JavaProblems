package objectsClasses;

import java.util.*;

public class studentsSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> listOfStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] scn = scanner.nextLine().split(" ");
            listOfStudents.add(new Student(scn[0], scn[1], Double.parseDouble(scn[2])));
        }

        Comparator<Student> compareByGrade = (Student o1, Student b) -> Double.compare(b.getGrade(), o1.getGrade());

        Collections.sort(listOfStudents, compareByGrade);

        for (Student student : listOfStudents) {
            System.out.print(student);
        }

    }

    public static class Student {

        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String toString () {
            return String.format("%s %s: %.2f\n", this.firstName, this.secondName, this.grade);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
    }

}
