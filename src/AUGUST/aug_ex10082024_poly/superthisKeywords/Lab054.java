package AUGUST.aug_ex10082024_poly.superthisKeywords;

public class Lab054 {
    public static void main(String[] args) {

        Car c = new Car();
        c.display();
    }
}

class Car extends Vehicle{

    private int maxspeed = 210;
    void display(){
        System.out.println("Car speed is --> " + this.maxspeed);
        System.out.println("Vehicle speed is --> " + super.maxspeed);
        super.message();
        this.message();
    }

    @Override
    void message(){
        System.out.println("Test Message");
    }
}

class Vehicle{

    public int maxspeed = 180;
    void message(){
        System.out.println("Hello Vehicle");
    }
}