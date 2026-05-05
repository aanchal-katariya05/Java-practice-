import java.util.Scanner;
public class PrimeNum {
    public static void main (String[] arg){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isPrime = true;

    if(num <= 1){
       isPrime = false;
    }
    else{
        for( int i = 2 ; i <= Math.sqrt(num) ; i++){
          if( num % 2 == 0){
               isPrime = false ; 
               break;
          }
         
        }
    }
    
    if(isPrime)
   {
    System.out.println("Prime Number");
   }
    else{
        System.out.println("Not a Prime Number");
    }

    }
}