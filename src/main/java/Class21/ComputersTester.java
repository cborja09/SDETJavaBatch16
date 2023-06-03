package Class21;

public class ComputersTester {

    public static void main(String[] args) {
        Computers[] computers=new Computers[4];
        computers[0]=new Apple("MacBook","Pro",13.5);
        computers[1]=new Dell("XPS","Fifteen",15.5);
        computers[2]=new HP("OMEN","QHD GAMING",16.4);
        computers[3]=new Lenovo("Slim Pro","Seven",14.3);

        for(Computers comp:computers){
            comp.printInfo();
            comp.automate();
            comp.help();
            comp.solve();
        }
        System.out.println();
        Apple apple=new Apple("Macbook","Pro",13.5);
        if(apple instanceof Apple){
            ((Apple)apple).design();
        }else{
            System.out.println("Incorrect object type.");
        }
        System.out.println();
        Dell dell=new Dell("XPS","Fifteen",15.5);
        if(dell instanceof Dell){
            ((Dell)dell).edit();
        }else{
            System.out.println("Incorrect object type.");
        }
        System.out.println();
        HP hp=new HP("OMEN","QHD GAMING",16.4);
        if(hp instanceof HP){
            ((HP)hp).game();
        }else{
            System.out.println("Incorrect objet type.");
        }
        System.out.println();
        Lenovo lenovo=new Lenovo("Slim Pro","Seven",14.3);
        if(lenovo instanceof Lenovo){
            ((Lenovo)lenovo).code();
        }else{
            System.out.println("Incorrect object type.");
        }

    }
}
