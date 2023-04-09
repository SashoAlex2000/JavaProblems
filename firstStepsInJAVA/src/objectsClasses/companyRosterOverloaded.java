package objectsClasses;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class companyRosterOverloaded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String [] shredded = scanner.nextLine().split(" ");
            String name = shredded[0];
            Double salary = Double.parseDouble(shredded[1]);
            String position = shredded[2];
            String department = shredded[3];


            if (shredded.length == 4) {
                Employee currentEmployee = new Employee(name, salary, position, department);
                employees.add(currentEmployee);
            } else if (shredded.length == 5) {
                String fifth = shredded[4];
                if (isNumeric(fifth)) {
                    Employee currentEmployee = new Employee(name, salary, position, department, Integer.parseInt(fifth));
                    employees.add(currentEmployee);
                } else {
                    Employee currentEmployee = new Employee(name, salary, position, department, fifth);
                    employees.add(currentEmployee);
                }
            } else {
                String fifth = shredded[4];
                int sixth = Integer.parseInt(shredded[5]);
                Employee currentEmployee = new Employee(name, salary, position, department, fifth, sixth);
                employees.add(currentEmployee);
            }

        }

        HashMap<String, Double> departments = new HashMap<String, Double>();

        for (Employee employee : employees) {
            String department = employee.department;
            double salary = employee.salary;

            if (!departments.containsKey(department)) {
                departments.put(department, salary);
            } else {
                double newDouble = salary + departments.get(department);
                departments.put(department, newDouble);
            }

        }

        System.out.println(departments);

        Map.Entry<String, Double> maxSalaryDepartment = null;

        for (Map.Entry<String, Double> department : departments.entrySet()) {
            if (maxSalaryDepartment == null || department.getValue().compareTo(maxSalaryDepartment.getValue()) > 0) {
                maxSalaryDepartment = department;
            }
        }

        System.out.printf("Highest Average Salary: %s\n", maxSalaryDepartment.getKey());

        for (Employee empl : employees) {
            if (maxSalaryDepartment.getKey().equals(empl.department)) {
                System.out.printf("%s %.2f %s %d\n", empl.name, empl.salary, empl.email, empl.age);
            }
        }

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static class Employee {

        private String name;
        private double salary;
        private String position;
        private String department;
        private String email;
        private int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public Employee(String name, double salary, String position, String department, String email) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age =-1;
        }

        public Employee(String name, double salary, String position, String department, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.age = age;
            this.email="n/a";
        }

        public Employee(String name, double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.age =-1;
            this.email="n/a";
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}