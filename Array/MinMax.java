public class MinMax {
 public static void main(String[] args) {
     int arr[] = { 1 ,2 ,4 ,5 ,66, 7 ,74, 5,7,68};
     int max = arr[0];
     int min = arr[0];

     for (int i = 1 ; i < arr.length ; i++) {
         if ( arr[i] > max ){
            max = arr[i];
         }
         if (arr[i] < min ){
            min = arr[i];
         }
     }
      System.out.println(max + " is Maximum ");
        System.out.println( min + " is Minimum");

 }   
}
