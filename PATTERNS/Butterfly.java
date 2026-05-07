public class Butterfly {
    public static void main(String[] args) {
        int n = 7 ;
        for(int i = 1 ; i <= n ; i++ )
        {
            for( int k = 1 ; k <= i ; k++)
            {
                System.out.print("*");
            }// this loop is for  left stars
            for( int j = 0 ; j <= 2 *( n - i ) ; j++){
                System.out.print(" ");
             // this loop is of middle space 
            }
            for( int l = 1 ; l <= i ; l++){
                System.out.print("*");
            } // this loop is for right stars
            System.out.println(); 
        }

        // second loop 
        for(int i = 7; i >= 1 ; i--)
        {
          for ( int k = 1 ; k <= i ; k++) {
              System.out.print("*");
              // this loop for left starts
          }
          for( int j = 1 ; j <= 2*( n - i) ; j++){
            System.out.print(" ");
            // this is for middle space
          }
          for( int l = 1 ; l <= i ; l++){
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
