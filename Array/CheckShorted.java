public class CheckShorted {
    public static void main (String[] arg){
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean isSorted = true ;
        for(int i = 0; i <= arr.length-2 ; i++ ){
    
          if(arr[i] > arr[i+1]){
            isSorted = false;
            break;
          }
        } 
        System.out.println(isSorted);
    }
}
