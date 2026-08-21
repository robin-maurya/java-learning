package day12.practice;

public class AnimalDemoInterface {

    public static void main(String[] args) {

        AnimalInterface animal = new DogInterface();

        animal.sound();
        animal.eat();
    }
}
