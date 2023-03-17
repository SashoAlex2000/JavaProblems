package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleCatalog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(line)) {

            String [] shredded = line.split(" ");

            Vehicle currentVehicle = new Vehicle(shredded[0], shredded[1], shredded[2], Double.parseDouble(shredded[3]));
            vehicles.add(currentVehicle);

            line = scanner.nextLine();
        }

        String newLine  = scanner.nextLine();

        while (!"Close the Catalogue".equals(newLine)) {

            for (Vehicle vehicle : vehicles) {
                if (newLine.equals(vehicle.getModel())) {
                    System.out.print(vehicle);
                    break;
                }
            }

            newLine = scanner.nextLine();
        }

        double averageCarHorsePower = getAverageCarHorsepower(vehicles);
        double averageTruckHorsePower = getAverageTruckHorsepower(vehicles);
        System.out.printf("Cars have average horsepower of: %.2f\n", averageCarHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f\n", averageTruckHorsePower);

    }

    public static double getAverageCarHorsepower(List<Vehicle> vehiclesList) {

        double result = 0;
        int counter = 0;

        for (Vehicle vehicle : vehiclesList) {
            if ("car".equals(vehicle.getTypeOfVehicle())) {
                result += vehicle.getHorsepower();
                counter++;
            }
        }

        return result / counter;

    }

    public static double getAverageTruckHorsepower(List<Vehicle> vehiclesList) {

        double result = 0;
        int counter = 0;

        for (Vehicle vehicle : vehiclesList) {
            if ("truck".equals(vehicle.getTypeOfVehicle())) {
                result += vehicle.getHorsepower();
                counter++;
            }
        }

        return result / counter;

    }

    public static class Vehicle {

        String typeOfVehicle;
        String model;

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public void setTypeOfVehicle(String typeOfVehicle) {
            this.typeOfVehicle = typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(double horsepower) {
            this.horsepower = horsepower;
        }

        String color;

        double horsepower;

        public Vehicle(String typeOfVehicle, String model, String color, double horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "Type:" + this.typeOfVehicle + '\n' +
                    "Model:" + this.model + '\n' +
                    "Color:" + this.color + '\n' +
                    "horsepower:" + this.horsepower + '\n' ;
        }
    }

}
