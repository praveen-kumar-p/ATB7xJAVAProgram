package ex17082024.Exception;

public class Lab073 {
    public static void main(String[] args) {

        final double pi = 3.14;
        int a = 0;
        try {
            int b = 10/a;
//        } catch (Exception e){
            //or
        } catch (Throwable e) {
            System.out.println("Divide by zero!!");
        } finally {
            System.out.println("I will be executed anywhere");
        }
    }
}
