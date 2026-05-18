package Constructor;


class Employee {
    String name;
    int id;
    double salary;

 Employee (String name , int id , double salary){
    this.name = name ;
    this.id = id ;
    this.salary = salary;

    System.out.println("name" + name);
    System.out.println("id" + id);
    System.out.println("salary" + salary);
 }

}


public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee("sonu" , 101 , 14000.54);
        Employee p2 = new Employee("monu" , 102 , 20000.84);
    }
    
}
