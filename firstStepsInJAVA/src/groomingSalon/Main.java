package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GroomingSalon salon = new GroomingSalon(20);
        Pet dog = new Pet("Ellias", 5, "Tim");
        System.out.println(dog);
        salon.add(dog);
        System.out.println(salon.remove("Ellias")); // true
        System.out.println(salon.remove("Pufa"));
        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");
        salon.add(cat);
        salon.add(bunny);
        Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet); // Bella 2 - (Mia)
        System.out.println(salon.getCount());
        System.out.println(salon.getStatistics());

    }

    public static class GroomingSalon {

        List<Pet> data = new ArrayList<>();
        int capacity;

        public GroomingSalon(int capacity) {
            this.capacity = capacity;
        }

        public void add(Pet pet) {

            if (this.capacity > this.data.size()) {
                data.add(pet);
            }

        }

        public boolean remove (String name) {

            for (int i = 0; i < this.data.size(); i++) {

                Pet currentPet = this.data.get(i);

                if (name.equals(currentPet.getName())) {
                    this.data.remove(i);
                    return true;
                }

            }

            return false;

        }

        public Pet getPet(String name, String owner) {

            for (int i = 0; i < this.data.size(); i++) {

                Pet currentPet = this.data.get(i);

                if (name.equals(currentPet.getName()) && owner.equals(currentPet.getOwner())) {
                    return currentPet;
                }

            }

            return null;

        }

        public int getCount () {
            return this.data.size();
        }

        public String getStatistics () {

            StringBuilder result = new StringBuilder("The grooming salon has the following clients:\n");

            for (Pet currentPet : this.data) {
                result.append(String.format("%s %s\n", currentPet.getName(), currentPet.getOwner()));
            }

            return result.toString();

        }

    }

    public static class Pet {
        String name;
        int age;
        String owner;

        public Pet(String name, int age, String owner) {
            this.name = name;
            this.age = age;
            this.owner = owner;
        }

        @Override
        public String toString() {
            return String.format("%s %d - (%s)", this.name, this.age, this.owner);
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

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
}


