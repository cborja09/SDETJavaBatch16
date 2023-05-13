package Class21;


class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

    void speak(){
        System.out.println("Animals speak");
    }

    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }

    void eat(){
        System.out.println("Animals eat");
    }
}

class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("Meow meow...");
    }
}
public class Dog extends Animal{

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("woof woof..");
    }
}

class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("Neigh neigh");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","black","German");
        dog.printInfo();

        Animal dog1=new Dog("Shaggy","Black","German");
        dog1.printInfo();

        Animal [] animals={new Dog("Shaggy","Black","German"), new Cat("Tom","Blue","Persian")};

        for(Animal animal:animals){
            animal.printInfo();
        }
    }
}
