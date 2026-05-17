

public class Stud {
    String name ;
    int rollNo ;
    float marks ;

    Stud(String name, int rollNo, float marks) 
       {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }


    public static void main(String[] args) {
    
        Stud s1 = new Stud("aanchal" , 101 , 45);
        System.out.println(s1.rollNo);
    }
}