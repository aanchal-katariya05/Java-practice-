public class ReverseParamid {
     public static void main(String[] args) {
        for( int i = 7 ; i >= 1; i--){
            for(int j = 0 ; j <= 7-i; j++){
                System.out.print(" ");
                // this is for space printing loop
            }
            for( int k = 1 ; k <= i*2-1 ; k++){
                System.out.print("*");
             // this is for star printing loop
            }
            System.out.println();
    }
}
}
