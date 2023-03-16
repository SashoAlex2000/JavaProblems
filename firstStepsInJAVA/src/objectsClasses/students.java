package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Student> students = new ArrayList<>();


        while (!"end".equals(line)) {

            String [] shredded = line.split(" ");

            if (isStudentExisiting(students, shredded[0], shredded[1])) {

                Student foundStudent = getStudent(students, shredded[0], shredded[1]);

                foundStudent.setAge(Integer.parseInt(shredded[2]));
                foundStudent.setHometown(shredded[3]);

            } else {

                Student currentStudent = new Student();

                currentStudent.setFirstName(shredded[0]);
                currentStudent.setLastName(shredded[1]);
                currentStudent.setAge(Integer.parseInt(shredded[2]));
                currentStudent.setHometown(shredded[3]);

                students.add(currentStudent);
            }


            line = scanner.nextLine();

        }

        String metaCity = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {

            Student current = students.get(i);

            if (metaCity.equals(current.getHometown())) {
                System.out.printf("%s %s is %d years old\n", current.getFirstName(), current.getLastName(), current.getAge());
            }

        }

    }
    private static boolean isStudentExisiting(List <Student> students, String firstName, String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;

    }

    private static Student getStudent(List<Student> listOfStudents, String firstName, String lastName) {

        Student result = null;

        for (Student student : listOfStudents) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                result = student;
            }
        }

        return result;

    }

    public static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

}
