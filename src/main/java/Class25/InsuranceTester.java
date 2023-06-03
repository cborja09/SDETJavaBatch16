package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        Car car1 = new Car("Subaru WRX");
        Car car2 = new Car("Toyota 4Runner");
        Car car3 = new Car("Nissan GTR");

        ArrayList<Car> arrayListCar = new ArrayList<>();
        arrayListCar.add(car1);
        arrayListCar.add(car2);
        arrayListCar.add(car3);

        for (Car car : arrayListCar) {
            System.out.println("Car Model: " + car.carModel);
            car.getQuote();
            car.cancelInsurance();
        }

        Pet pet1 = new Pet("Dog: Yorkie");
        Pet pet2 = new Pet("Dog: Pitbull");
        Pet pet3 = new Pet("Lizard: Bearded Dragon");

        ArrayList<Pet> arrayListPet = new ArrayList<>();
        arrayListPet.add(pet1);
        arrayListPet.add(pet2);
        arrayListPet.add(pet3);

        for (int i = 0; i < arrayListPet.size(); i++) {
            Pet pet = arrayListPet.get(i);
            pet.getQuote();
            pet.cancelInsurance();
        }

        Health health1 = new Health("Spouse");
        Health health2 = new Health("Single");
        Health health3 = new Health("Child");

        ArrayList<Health> arrayListHealth = new ArrayList<>();
        arrayListHealth.add(health1);
        arrayListHealth.add(health2);
        arrayListHealth.add(health3);

        Iterator<Health> iteratorHealth = arrayListHealth.iterator();
        while (iteratorHealth.hasNext()) {
            Health health = iteratorHealth.next();
            System.out.println("Health Category: " + health.category);
            health.getQuote();
            health.cancelInsurance();
        }
    }
}
