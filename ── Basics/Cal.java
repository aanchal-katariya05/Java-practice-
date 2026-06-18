import java.util.Scanner;

// Q3 — Calculator

public class Cal {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second num : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator ( + , - , * , / ) : ");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
            System.out.println(num1 - num2);
            break;

            case '*':
            System.out.println(num1 * num2);
            break;

            case '/':
            if ( num2 == 0 ){
                System.out.println( "Error : 0 se divide nhi kar skte ");
            }
            else {
                System.out.println(num1 / num2);
            }
            break;

            default:
                throw new AssertionError();
        }
    }
}