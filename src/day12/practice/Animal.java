package day12.practice;

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
