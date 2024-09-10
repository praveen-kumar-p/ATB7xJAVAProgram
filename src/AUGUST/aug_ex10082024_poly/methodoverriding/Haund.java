package AUGUST.aug_ex10082024_poly.methodoverriding;

public class Haund extends Dog{

    @Override
    void bark(){
        System.out.println("I am haund, I can bark");
    }

    @Override
    void bite(){
        System.out.println("Haund can bite");
    }
}