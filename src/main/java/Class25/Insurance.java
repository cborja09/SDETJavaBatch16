package Class25;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel
and Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

public interface Insurance{
    String insuranceName="Kramer's Insurance";

    void getQuote();
    void cancelInsurance();
}

class Car implements Insurance {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("We'll be in contact about your car insurance quote.");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We are cancelling your car insurance.");
    }
}

class Pet implements Insurance {
    String petType;

    public Pet(String petType){
        this.petType=petType;
    }
    @Override
    public void getQuote(){
        System.out.println("We'll be in contact about your pet insurance quote");
    }

    @Override
    public void cancelInsurance(){
        System.out.println("We are cancelling your pet insurance.");
    }
}

class Health implements Insurance {

    String category;

    public Health(String category) {
        this.category = category;
    }

    @Override
    public void getQuote() {
        System.out.println("We'll be in contact about your health insurance quote.");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We are cancelling your health insurance");
    }
}

