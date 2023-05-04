package Class14;

public class Homework2 {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type, your
    method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail(String firstName, String lastName, String emailType){
        String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
        return email;
    }

    public static void main(String[] args) {
        Homework2 obj=new Homework2();
        String firstName="Brock";
        String lastName="Purdy";
        String emailType="iCloud";
        String emailAddress=obj.createEmail(firstName,lastName,emailType);
        System.out.println(emailAddress);
    }
}
