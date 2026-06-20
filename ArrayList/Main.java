package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       List <String> I = new ArrayList<>();

       I.add("Java");
       I.add("Python");
       I.add("C++");
       I.add("Javascript");
       I.add("React");
       I.add("Django");

       for( String courses : I){
        System.out.println(courses);
       }
       String userInput = sc.nextLine();

       boolean isCheck = false;

       if( I.contains(userInput)){
         isCheck = true;
         System.out.println("found course");
       }
       else{
          isCheck = false;
          System.out.println("Not found");
       }

    }
}
