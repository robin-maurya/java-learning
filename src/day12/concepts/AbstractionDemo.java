package day12.concepts;

abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

interface ElectricVehicle {

    void charge();
}


public class AbstractionDemo {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();

        tesla.start();
        tesla.charge();
        tesla.stop();
    }
}

class Tesla extends Vehicle implements ElectricVehicle {

    @Override
    void start() {
        System.out.println("Tesla starts silently");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}
