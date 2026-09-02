package day12.concepts;

interface Printable {

    void print();
}

interface Showable {

    void show();
}


public class MultipleInterfaceDemo {
    public static void main(String[] args) {

        Document document = new Document();

        document.print();
        document.show();
    }
}

class Document implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void show() {
        System.out.println("Showing document");
    }
}