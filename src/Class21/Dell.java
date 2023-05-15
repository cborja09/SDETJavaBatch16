package Class21;

public class Dell extends Computers{
    Dell(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }
    @Override
    void printInfo(){
        System.out.println(name+" "+model+" " +"with a "+screenSize+"screen size.");
    }
    @Override
    void automate(){
        System.out.println("Dell computers can help automate certain tasks.");
    }
    @Override
    void help(){
        System.out.println("Dell computers can help us with daily tasks.");
    }
    @Override
    void solve(){
        System.out.println("Dell computers can help us solve any questions that we have.");
    }
    void edit(){
        System.out.println("Dell computers can edit word documents for you.");
    }
}
