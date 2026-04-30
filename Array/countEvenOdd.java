public class countEvenOdd {
    public static void main(String[] args) {
       int arr[] = {2, 5, 6, 3, 8, 4 , 10};
       int evenCount = 0;
       int oddCount = 0;


       for( int i = 0 ; i < arr.length; i++){
          if ( arr[i] % 2 == 0){
            // count = arr[i];
             evenCount++;
          }
          if( arr[i] % 2 != 0){
            oddCount++;
          }
       }
       System.out.println(oddCount + " is odd count ");
       System.out.println(evenCount + " is even count ");

    }
}
