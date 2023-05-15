package Class21;

public class Computers {

    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.

    String name;
    String model;
    double screenSize;

    Computers(String name, String model, double screenSize){
        this.name=name;
        this.model=model;
        this.screenSize=screenSize;
    }

    void printInfo(){
        System.out.println(name+" "+model+" " +"with a "+screenSize+"screen size.");
    }
    void automate(){
        System.out.println("Computers can help automate certain tasks.");
    }
    void help(){
        System.out.println("Computers can help us with daily tasks.");
    }
    void solve(){
        System.out.println("Computers can help us solve any questions that we have.");
    }


}
