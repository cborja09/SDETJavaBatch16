package Class21;

public class HP extends Computers{
    HP(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }
    @Override
    void printInfo(){
        System.out.println(name+" "+model+" " +"with a "+screenSize+"screen size.");
    }
    @Override
    void automate(){
        System.out.println("HP computers can help automate certain tasks.");
    }
    @Override
    void help(){
        System.out.println("HP computers can help us with daily tasks.");
    }
    @Override
    void solve(){
        System.out.println("HP computers can help us solve any questions that we have.");
    }
    void game(){
        System.out.println("HP computers has different genres of free games you can play.");
    }
}
