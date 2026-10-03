package day15.practice;


class Container<T> {

    T data;

    void setData(T data) {
       this.data = data;
    }

    T getData() {
        return data;
    }
}
public class GenericContainer {

    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>();
        stringContainer.setData("Robin");

        System.out.println(stringContainer.getData());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setData(500);

        System.out.println(integerContainer.getData());
    }
}
