package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";

        actualDog.bark();

        Dog obj=new Dog();
        actualDog.name="CB";
        actualDog.age=9;
        actualDog.breed="Pit Bull";
        actualDog.color="Brown";

        actualDog.eat();
    }
}
