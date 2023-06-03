package Class22;

public abstract class Animal {
    /*
    create 3 animals like dog cat and horse
    define 3 common methods in each class like speak eat and sleep
    create the object of all the classes and call the methods
     */

    abstract void speak(); //method header
    abstract void eat(); //method header
    abstract void sleep(); //method header

}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Woof woof");
    }
    @Override
    void eat(){
        System.out.println("Chewing bones");
    }
    @Override
    void sleep(){
        System.out.println("Sleeping Zzzz 8 to 10 hours");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meow meow");
    }

    @Override
    void eat() {
        System.out.println("Eating fish");
    }
    @Override
    void sleep(){
        System.out.println("Sleeping Zzzzzzz 12 to 16 hours");
    }
}
