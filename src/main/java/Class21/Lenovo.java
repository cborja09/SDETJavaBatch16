package Class21;

public class Lenovo extends Computers{
    Lenovo(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }
    @Override
    void printInfo(){
        System.out.println(name+" "+model+" " +"with a "+screenSize+"screen size.");
    }
    @Override
    void automate(){
        System.out.println("Lenovo computers can help automate certain tasks.");
    }
    @Override
    void help(){
        System.out.println("Lenovo computers can help us with daily tasks.");
    }
    @Override
    void solve(){
        System.out.println("Lenovo computers can help us solve any questions that we have.");
    }
    void code(){
        System.out.println("Lenovo computers can you on your coding journey.");
    }
}
