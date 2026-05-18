package MethodOverriding;

class Animal {
    void sound(){
        System.out.println("animals makes sound");
    }
}

 class Dog extends Animal {

    @Override void sound(){
        System.out.println("Dog sounds barks");
    }
    
 }



public class Main {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.sound();
    }
}
