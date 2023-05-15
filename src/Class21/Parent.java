package Class21;

public class Parent {

    final void getMarry(){
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}

class Axel extends Parent{

    @Override
    void study(){
        System.out.println("No I want SDET");
    }
}
