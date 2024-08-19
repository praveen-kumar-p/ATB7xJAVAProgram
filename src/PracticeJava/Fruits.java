package PracticeJava;

public class Fruits {

    String name;
    String colour;
    int count;


    public static void main(String[] args) {
        Fruits f = new Fruits();
        f.name = "Apple";
        f.colour = "Red";
        f.count = 1;
        System.out.println(f.name);
        System.out.println(f.colour);
        System.out.println(f.count);


        Fruits f1 = new Fruits();
        f1.name = "Grapes";
        f1.colour = "green";
        f1.count = 2;
        System.out.println(f1.name);
        System.out.println(f1.colour);
        System.out.println(f1.count);
    }
}