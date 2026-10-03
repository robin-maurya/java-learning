package day15.concepts;

class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericBox {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Robin");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);

        System.out.println(integerBox.getValue());
    }

}
