package aug_ex10082024_poly.superthisKeywords;

public class Lab055 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
    }

class child extends parent{

    @Override
    void message(){
        System.out.println("I am child class");
    }

    void display(){
        super.message();
        this.message();
    }
}

class parent{
    void message(){
        System.out.println("I am Parent class");
    }
}
