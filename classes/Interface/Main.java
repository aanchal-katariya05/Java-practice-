package Interface;

interface  Camera {
    void takePhotos();
}

class Phone implements Camera
{
    public void takePhotos(){
        System.out.println("you can also click the photos");
    }
}


public class Main {
    public static void main(String[] args) {
         Camera c1 = new Phone();
        c1.takePhotos();
    }
}
