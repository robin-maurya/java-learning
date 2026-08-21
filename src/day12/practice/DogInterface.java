package day12.practice;

public class DogInterface implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Inter: Dog barks");
    }
}
