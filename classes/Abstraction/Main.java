package Abstraction;

abstract class Payment {
   abstract void pay();
}
class UPIPayment extends Payment{
    void pay(){
         System.out.println("Pay by your UPI Id");
    }
}

class CardPayment extends Payment {
    void pay(){
        System.out.println("Pay by your Card");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.pay();

        Payment p2 = new CardPayment();
        p2.pay();
    }
}
