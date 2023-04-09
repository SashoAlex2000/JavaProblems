package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static objectsClasses.companyRosterOverloaded.isNumeric;

public class carSalesman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfEngines; i++) {
            String [] shredded = scanner.nextLine().split(" ");

            Engine engine;

            if (shredded.length == 2) {
                engine = new Engine(shredded[0], Integer.parseInt(shredded[1]));
            } else if (shredded.length == 3) {
                if (isNumeric(shredded[2])) {
                    engine = new Engine(shredded[0], Integer.parseInt(shredded[1]), Integer.parseInt(shredded[2]));
                } else {
                    engine = new Engine(shredded[0], Integer.parseInt(shredded[1]), shredded[2]);
                }
            } else {
                engine = new Engine(shredded[0], Integer.parseInt(shredded[1]), Integer.parseInt(shredded[2]), shredded[3]);
            }

            engines.add(engine);

        }

        for (Engine engine : engines) {
            System.out.println(engine.toString());
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCars; i++) {

            String [] shredded = scanner.nextLine().split(" ");

            Car car;
            Engine engine = null;
            String engineName = shredded[1];

            for (int j = 0; j < engines.size(); j++) {
                if (engineName.equals(engines.get(j).model)) {
                    engine = engines.get(j);
                    break;
                }
            }

            if (shredded.length == 2) {
                car = new Car(shredded[0], engine);
            } else if (shredded.length == 3) {
                if (isNumeric(shredded[2])) {
                    car = new Car(shredded[0], engine, Integer.parseInt(shredded[2]));
                } else {
                    car = new Car(shredded[0], engine, shredded[2]);
                }
            } else {
                car = new Car(shredded[0], engine, Integer.parseInt(shredded[2]), shredded[3]);
            }

            cars.add(car);

        }

        for (Car car : cars) {
            System.out.print(car.toString());
        }

    }

    public static class Car {

        @Override
        public String toString() {

            String weight = this.weight == null ? "n/a" : Integer.toString(this.weight);
            String color = this.color == null ? "n/a" : this.color;

            return this.model + ":\n  " + this.engine.toString() + "\n  Weight:" +
                    " " + weight + "\n  Color: " + color + "\n";
        }

        private String model;
        private Engine engine;
        private Integer weight;
        private String color;



        public Car(String model, Engine engine) {
            this.model = model;
            this.engine = engine;
        }

        public Car(String model, Engine engine, Integer weight) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
        }

        public Car(String model, Engine engine, String color) {
            this.model = model;
            this.engine = engine;
            this.color = color;
        }

        public Car(String model, Engine engine, Integer weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

    }

    public static class Engine {

        private String model;
        private int power;
        private Integer displacement;
        private String efficiency;

        @Override
        public String toString() {

            String displacement = this.displacement == null ? "n/a" : Integer.toString(this.displacement);
            String efficiency = this.efficiency == null ? "n/a" : this.efficiency;

            String result = String.format("%s\n    Power: %d\n    Displacement: %s\n    Efficiency: %s",
                    this.model, this.power, displacement, efficiency);

            return result;
        }

        public Engine(String model, int power) {
            this.model = model;
            this.power = power;
        }

        public Engine(String model, int power, Integer displacement) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
        }

        public Engine(String model, int power, String efficiency) {
            this.model = model;
            this.power = power;
            this.efficiency = efficiency;
        }

        public Engine(String model, int power, Integer displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }
    }

}
