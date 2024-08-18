package ex17082024.Exception;

public class Lab070 {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("Divide by zero, youfool!!");
        }
        System.out.println(a);
    }
}
