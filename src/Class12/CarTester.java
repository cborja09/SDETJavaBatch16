package Class12;

public class CarTester {
    public static void main(String[] args) {

        // below code will create an object of car class
        Car car=new Car();
        car.make="Toyota";
        car.model="Prius";
        car.color="White";
        car.mileage=0;
        car.isAutomatic=true;
        car.startCar();
        car.turn();
        car.stopCar();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="S";
        car1.mileage=15000;
        car1.isAutomatic=true;
        car.startCar();
        car1.stopCar();

    }
}
