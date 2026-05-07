public class SecondLargest {
    public static void main (String [] arg){
         int arr[] = { 10 ,5 , 20 , 8 , 25};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for( int i = 0 ; i < arr.length ; i++){
            if ( arr[i] > largest ) {
                secondLargest = largest;
                largest = arr[i];

            }
            else if ( arr[i] > secondLargest && arr[i] < largest ) {
                secondLargest = arr[i];
            }
        }
        System.out.println("largest num : " + largest );
        System.out.println("Second largest num : " + secondLargest);
    }
}
