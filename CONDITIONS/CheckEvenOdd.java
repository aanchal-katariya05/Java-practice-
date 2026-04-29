import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        checkEvenOdd(num);  // function call
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        }
    }
}
