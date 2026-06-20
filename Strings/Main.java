public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();
            System.out.println( "Length : "   + s.length());
            System.out.println("UpperCase : " + s.toUpperCase());
            System.out.println("Reverse : " + reversed);
        
            
    }
}