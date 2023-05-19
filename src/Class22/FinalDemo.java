package Class22;

public class FinalDemo {

    final String SSN;
    FinalDemo(String SSN){
        this.SSN=SSN;
    }

    void changeSSN(){
        // not allowed as value will be assigned already in constructor
       // SSN="snsnsns";
    }
}
