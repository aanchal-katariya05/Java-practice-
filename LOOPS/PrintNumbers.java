import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int i = 1 ; i <= n ; i++)
        {
            System.out.println(i);
        }
    }

}