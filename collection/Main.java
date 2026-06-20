import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id ;
    String name;
    double salary;

 Employee( int id , String name , double salary){
        this.id = id ;
        this.name = name;
        this.salary = salary;
    }

void getData() {
    System.out.println( "Id : " + id);
    System.out.println("Name : " + name);
    System.out.println(" Salary : " + salary);
    System.out.println("--------------------------");
}

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Employee> E = new ArrayList<>();

        E.add(new Employee(101 , "hello" , 34300));
        E.add(new Employee(102, "Shurti", 34000));
        E.add(new Employee(103, "RAJ", 30000));
        E.add(new Employee(104, "Yuvika", 20000));
        E.add(new Employee(105, "Rani", 25000));

        for( Employee emp : E){
            emp.getData();
        }

        Employee highest = E.get(0);
        double sum = 0;

        for( Employee emp : E){

           sum = emp.salary + sum;

            if( emp.salary > highest.salary){
                highest = emp;
            }
        }

        double average = sum / E.size();

        System.out.println( " Highest Salary : ");
        highest.getData(); 
        
        System.out.println(" Average Salray : " + average);
    }
}