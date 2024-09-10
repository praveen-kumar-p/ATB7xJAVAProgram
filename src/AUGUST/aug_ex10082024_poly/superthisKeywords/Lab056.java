package AUGUST.aug_ex10082024_poly.superthisKeywords;

public class Lab056 {
    public static void main(String[] args) {


    }

class person{

    // Default Constructor
    person() {
        System.out.println("DC -- Constructor");
    }

    person(String a){
        System.out.println("Person1 -- PS");
    }

    person(String a, int b){
        System.out.println("Person -- PC");
    }
    }

class student extends person{
    student(String s){
//        super();
        super("praveen");
        System.out.println("PC -- Student");
    }
}
}