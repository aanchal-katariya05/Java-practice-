class BankAccount {
    int accountNumber ;
    String holderName ;
    double balance ;
 
    BankAccount( int accountNumber , String holderName , double balance )
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
 
   void display(){
     System.out.println("Account No :" + accountNumber);
     System.out.println("Name :" + holderName) ;
     System.out.println("Balance" + balance);
   }

   void Deposit( double amount){
         balance += amount;

   }

   void Withdrawal( double amount){
       if (amount <= balance){ 
        balance -= amount;
        System.out.println("Withdrawal succesfully " + balance);}
      
     else{System.out.println("Insufficient Balance");}
   }
}

class FractionalAccount extends BankAccount {

    public FractionalAccount( int accountNumber , String holderName , double balance) {
        super( accountNumber , holderName , balance);
    }
     
}

class NonFractionalAccount extends BankAccount {

    NonFractionalAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, (int) balance);
    }

    @Override
    void Deposit ( double amount)
    {
        super.Deposit( (int) amount);
    }

    @Override 
    void Withdrawal (double  amount)
    {
        super.Withdrawal( (int) amount);
    }
}
public class main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Aanchal", 1000);
        b1.display();

        System.out.println("----------------------");

        FractionalAccount f1 = new FractionalAccount(102 , "riya", 2000.75);
        f1.display();

        System.out.println("-------------------");

        NonFractionalAccount n1 = new NonFractionalAccount(102, "jiya" , 3000.75);
        n1.Deposit(200.75);
        n1.display();
    }

}