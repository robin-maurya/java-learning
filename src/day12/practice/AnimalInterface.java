package day12.practice;

public interface AnimalInterface {

    void sound();

    default void eat() {
        System.out.println("inter: Animal is eating");
    }
}
