package AUGUST.aug_ex04082024;

public class Lab042 {

    int e = 45; // Instance Variable != Global Variable

    void f1() {
        int e = 10; // Local Variable
        System.out.println(e);
    }

    void f2() {
        e = 50;
        System.out.println(e);
    }
}