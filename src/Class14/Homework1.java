package Class14;

public class Homework1 {
    /*
    Create a method that will say Hello in different language based on the country
    that will pass when method is executed.
     */

    void sayHello(String country){
        switch (country.toUpperCase()){
            case "USA":
                System.out.println("Hello");
                break;
            case "Mexico":
                System.out.println("Hola");
                break;
            case "Philippines":
                System.out.println("Mabuhay");
                break;
            case "China":
                System.out.println("Ni hao");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("I'm sorry I don't know how to say hello in that language.");
        }
    }

    public static void main(String[] args) {
        Homework1 obj=new Homework1();
        String country="USA";
        obj.sayHello(country);
    }
}
