package day09.practice;

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Robin");
        s1.setAge(25);

        System.out.println("Name : " + s1.getName());
        System.out.println("Age : " + s1.getAge());
    }
}
