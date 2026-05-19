package Polymorphism;

class Animal {
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    @Override void sound(){
        System.out.println("Dogs bark");
    }
}

class Cat extends Animal{
    @Override void sound(){
        System.out.println("Cat sounds like Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();

        Animal a2 = new Cat();
        a2.sound();
    }
}
