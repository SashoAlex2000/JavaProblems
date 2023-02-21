package firstPackage.lab;

import java.util.Scanner;

public class projectMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int hoursePerProject = 3;
        int totalHoursNeeded = projectNumber * hoursePerProject;

        System.out.println("The architect " + name + " will need " + totalHoursNeeded + " hours to complete " + projectNumber + " project/s.");
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHoursNeeded, projectNumber);
    }
}
