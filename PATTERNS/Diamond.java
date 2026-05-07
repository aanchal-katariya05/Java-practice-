public class Diamond {
     public static void main(String[] args) {
         for( int i = 1 ; i <= 7 ; i++){
            for( int j = 1 ; j <= 7-i ; j++)
            {
                System.out.print(" ");
            } // this loop for space printing
            for( int k = 1 ; k <= i*2-1 ; k++){
                System.out.print("*");
            } // this loop for star printing
            System.out.println();
         }
         for( int i = 6 ; i >= 1 ; i--){
            for( int j = 1 ; j <= 7-i ; j++)
            {
                System.out.print(" ");
            } // this loop for space printing
            for( int k = 1 ; k <= i*2-1 ; k++){
                System.out.print("*");
            } // this loop for star printing
            System.out.println();
         }
     }

}
