package day10.practice;

public class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
