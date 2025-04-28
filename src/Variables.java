public class Variables {
    void displayNewBalance(){
       
        double balance;
        double UsedAmount;
        
        balance = 10000.00;
        System.out.println("Balance: " + balance);
        
        UsedAmount= 500.0;
        balance = balance - UsedAmount;
        System.out.println("NEW Balance: " + balance);
        
    }
    public static void main (String[] args) {
        (new Variables()).displayNewBalance();
    }
}
