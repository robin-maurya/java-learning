package day12.practice.MultipleInterfaces;

public class Document implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void show() {
        System.out.println("Showing document");
    }
}