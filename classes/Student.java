public class Student {
    String name;
    int rollNo;
    double marks;
  
   void displayDetails(String name , int  rollNo , double marks){
     
        this.name = name ;
        this.rollNo = rollNo ;
        this.marks = marks ;

        System.out.println("Name : " + name);
        System.out.println("rollNo : " + rollNo);
        System.out.println("marks : " + marks);
        
    }

    public static void main(String[] args) {
    Student s1 = new Student();
    s1.displayDetails("Aanchal katariya", 101, 42.2);
}
}
