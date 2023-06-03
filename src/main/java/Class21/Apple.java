package Class21;

public class Apple extends Computers{
    Apple(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }
    @Override
    void printInfo(){
        System.out.println(name+" "+model+" " +"with a "+screenSize+"screen size.");
    }
    @Override
    void automate(){
        System.out.println("Apple computers can help automate certain tasks.");
    }
    @Override
    void help(){
        System.out.println("Apple computers can help us with daily tasks.");
    }
    @Override
    void solve(){
        System.out.println("Apple computers can help us solve any questions that we have.");
    }
    void design(){
        System.out.println("Apple computers can design art for you.");
    }

}
