package day12.concepts;

interface Animals {

    void sound();
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Animals animal = new Dogs();

        animal.sound();
    }
}

class Dogs implements Animals {

    @Override
    public void sound() {
        System.out.println("Dog barks2");
    }
}