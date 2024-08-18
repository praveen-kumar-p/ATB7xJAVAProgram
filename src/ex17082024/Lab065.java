package ex17082024;

public class Lab065 {
    public static void main(String[] args) {

        OC n = new OC();
        System.out.println(n.a);

        OC.Innerclass g = n.new Innerclass();
        g.drive();
    }
}

class OC{
    Integer a = 10;

    class Innerclass{
        Integer b = 20;
        void Inner_m2(){
            System.out.println(a);
        }

        void drive(){
            System.out.println();
        }
    }
}