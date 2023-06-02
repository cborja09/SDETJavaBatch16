package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        /*
        ArrayList => a class (It's part of the collection's framework)
        <> These are call angle brackets or diamond operators. We write them name of the class who's objects we are planning
        to store in an array list
         */

        Car car1 = new Car("Toyota","Prius");
        Car car2 = new Car("Honda","Civic");
        Car car3 = new Car("BMW","I7");

        ArrayList<Car> arrayList = new ArrayList<>();
        // creating object of the car class and storing it in a array list
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        for (Car c:arrayList){ //enhanced for loop. used to print out array list of cars.
            c.printInfo();
        }

    }
}

class Car{
    String make;
    String model;
    Car(String make, String model){
        this.make=make;
        this.model=model;
    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}
