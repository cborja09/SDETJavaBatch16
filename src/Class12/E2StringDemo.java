package Class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String userName="Admin";
        String password="pass123";
        // write code to check the username and password. If the username and password
        // are less than 8 characters this message should be printed "Signup successfull".
        // Otherwise print "Username and password can't be more than 8 characters.

        if (userName.length()>8 && password.length()>8){
            System.out.println("Username and password can't be more than 8 characters.");
        }else{
            System.out.println("Signup successful.");
        }

    }
}
