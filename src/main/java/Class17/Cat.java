package Class17;

public class Cat {

    String name;

    Cat(String catName){
        name=catName;
        System.out.println("1 argument constructor called");
    }

    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(double weight){
        System.out.println("Double argument constructor");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }

    void printInfo90(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        //String color;
        //System.out.println(color);
        Cat cat=new Cat(10.5);
        cat.printInfo90();
    }
}
