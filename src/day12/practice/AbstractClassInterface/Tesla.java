package day12.practice.AbstractClassInterface;

public class Tesla extends Vehicle implements ElectricVehicle {

    @Override
    void start() {
        System.out.println("Tesla starts silently");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}
