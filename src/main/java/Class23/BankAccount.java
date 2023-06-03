package Class23;

public class BankAccount {
    private String userName;
    private String passWord;
    private double accountBalance=120;
    public BankAccount(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    public double getAccountBalance(String password){
        if(passWord.equals(this.passWord)){
            return accountBalance;
        }else{
            return 0;
        }
    }
}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("User123","password");
        System.out.println(bankAccount.getAccountBalance("password"));
    }
}
