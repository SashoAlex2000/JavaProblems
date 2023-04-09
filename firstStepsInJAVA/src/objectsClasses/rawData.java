package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rawData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String [] shredded = scanner.nextLine().split(" ");

            Model model = new Model();
            model.setName(shredded[0]);

            Engine engine = new Engine();
            engine.setSpeed(Integer.parseInt(shredded[1]));
            engine.setPower(Integer.parseInt(shredded[2]));

            Cargo cargo = new Cargo();
            cargo.setWeight(Integer.parseInt(shredded[3]));
            cargo.setType(shredded[4]);

            Tire tire1 = new Tire();
            tire1.setPressure(Double.parseDouble(shredded[5]));
            tire1.setAge(Integer.parseInt(shredded[6]));

            Tire tire2 = new Tire();
            tire2.setPressure(Double.parseDouble(shredded[7]));
            tire2.setAge(Integer.parseInt(shredded[8]));

            Tire tire3 = new Tire();
            tire3.setPressure(Double.parseDouble(shredded[9]));
            tire3.setAge(Integer.parseInt(shredded[10]));

            Tire tire4 = new Tire();
            tire4.setPressure(Double.parseDouble(shredded[11]));
            tire4.setAge(Integer.parseInt(shredded[12]));

            Car currentCar = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            cars.add(currentCar);

        }

        String command = scanner.nextLine();

        for (Car car : cars) {

            if ("fragile".equals(command)) {
                if ("fragile".equals(car.cargo.getType())) {
                    if (car.tire1.getPressure() < 1 || car.tire2.getPressure() < 1 || car.tire3.getPressure() < 1 || car.tire4.getPressure() < 1) {
                        System.out.println(car.model.getName());
                    }
                }
            } else if ("flamable".equals(command)) {
                if ("flamable".equals(car.cargo.getType())) {
                    if (car.engine.getPower() > 250) {
                        System.out.println(car.model.getName());
                    }
                }
            }

        }

    }

    public static class Car {

    Model model;
    Engine engine;
    Cargo cargo;
    Tire tire1;
    Tire tire2;
    Tire tire3;
    Tire tire4;

        public Car(Model model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tire1 = tire1;
            this.tire2 = tire2;
            this.tire3 = tire3;
            this.tire4 = tire4;
        }
    }

    public static class Model {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Engine {

        private int speed;
        private int power;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }

    public static class Cargo {

        private int weight;
        private String type;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Tire {

        private int age;
        private double pressure;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }
    }

}
