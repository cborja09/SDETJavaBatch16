package Class17;

public class Dog {

    // create 5 objects of this dog class provide initial values and for each object call the printInfo method
    String name;
    String color;
    String breed;
    int age;

    Dog(String dogName, String dogColor, String dogBreed, int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
    }
}
