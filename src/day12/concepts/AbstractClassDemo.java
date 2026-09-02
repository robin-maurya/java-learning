package day12.concepts;

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}


public class AbstractClassDemo {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        animal.eat();
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
