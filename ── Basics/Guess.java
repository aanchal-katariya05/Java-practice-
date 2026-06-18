import.java.util.Scanner;
// guess the number game 
public class Guess {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() *100 + 1);
        
        while ( true ) { 
            int userInput = sc.nextInt();
            if( userInput == num ){
                System.out.println("Correct choice");
                break;
            }
            
            else if ( userInput <= num){
                System.out.println("too small");
            }
            else if (userInput >= num ){
                System.out.println("to big");
            }
        }
    }
}