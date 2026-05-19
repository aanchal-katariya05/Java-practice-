class Animal {
    Animal() {
    System.out.println("Animal constructor called");
}
}

class Dog extends Animal {
    
     Dog(){
        super();
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args){

        Dog d1 = new Dog();
        Animal a1 = new Animal();
    }
}

