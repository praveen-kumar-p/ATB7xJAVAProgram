package PracticeJava;

public class Person_Constructor {

    String name;
    long phone;

    public Person_Constructor(String name, long phone) {
        this.name = name;
        this.phone = phone;
        System.out.println("Reading data from Excel");
    }

    public static void main(String[] args) {
        Person_Constructor p = new Person_Constructor("praveen", 997294401);
        Person_Constructor p1 = new Person_Constructor("Pradeep", 819743123);
        System.out.println(p.name);
        System.out.println(p1.name);
    }
}