public class Account {
    public static double interestRate = 5.0;
    private String name;
    private double balance;
    
    public Account() {
        name = "Default Account";
        balance = 0.0;
    }
    public Account(String n, double b) {
        name = n;
        balance = b;
    }
    
    public String nameKi() {
        return name;
    }
    public double balanceKi() {
        return balance;
    }
    public void nameBoshao(String n) {
        name = n;
    }
    public void balanceBoshao(double b) {
        balance = b;
    }
    
    public void withdraw(double b) {
        if(balance-b>100) {
            System.out.println("Withdraw successful! New balance is: "+(balance-b));
        }else {
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }
}