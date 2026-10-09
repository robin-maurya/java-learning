
package day15.concepts;

public class GenericClass {

    static class Container<T> {
        private T data;

        public void setData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        Container<String> name = new Container<>();
        name.setData("Robin");

        Container<Integer> number = new Container<>();
        number.setData(100);

        System.out.println("Name: " + name.getData());
        System.out.println("Number: " + number.getData());
    }
}
