package objectsClasses;

import java.util.*;

public class companyRoster {

    public static void main(String[] args) {

//        Employee empl1 = new Employee("Gosho", 120, "CEO", "Management", "a@a.com", Optional.of(31));
//        Employee empl2 = new Employee("Sasho", 120, "CFO", "Management", null, null);
//
//        System.out.println(empl1.getAge().orElse(-1));
//        System.out.println(empl2.getAge().orElse(-1));
//
//        System.out.println(empl1);

        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] shredded = scanner.nextLine().split(" ");

            String name = shredded[0];
            double salary = Double.parseDouble(shredded[1]);
            String position = shredded[2];
            String department = shredded[3];
            String email = null;
            Optional<Integer> age = null;

            System.out.println(Arrays.toString(shredded));
            System.out.println(shredded.length);

            if (shredded.length == 5) {
                // this is always String ... TODO check if int
                if (shredded[4] instanceof String) {
                    email = shredded[4];
                } else {
                    age = Optional.of(Integer.parseInt(shredded[4]));
                }

            }

            if (shredded.length > 5) {
                email = shredded[4];
                age = Optional.of(Integer.parseInt(shredded[5]));
            }

            Employee current = new Employee(name, salary, position, department, email, age);
            employees.add(current);
        }

        for (Employee employee : employees) {
            System.out.println(employee.getEmail().orElse("bazinga"));
        }

    }

    // The wrong way to do it, shouldn't use Optional, but overload the constructor
    public static class Employee {

        private String name;
        private double salary;
        private String position;
        private String department;

        private Optional<String> email;


        private Optional<Integer> age;

        public Employee(String name, double salary, String position, String department, String email, Optional<Integer> age) {

            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = Optional.ofNullable(email);
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Optional<String> getEmail() {
            return email;
        }

        public void setEmail(Optional<String> email) {
            this.email = email;
        }

        public Optional<Integer> getAge() {
            return age;
        }

        public void setAge(Optional<Integer> age) {
            this.age = age;
        }
    }

}
