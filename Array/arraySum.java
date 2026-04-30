public class arraySum {
    public static void main(String[] args) {
        int arr[] = { 10 , 44 ,53 ,21, 34, 87 , 9};
        int sum = 0;

        for( int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of array is " + sum);
    }
}
