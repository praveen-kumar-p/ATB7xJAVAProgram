package ex17082024.Exception;

public class Lab071 {
    public static void main(String[] args) {

        System.out.println("Start of Program");
        int b = 0;
        try {
            String ip = args[0];  //"ArrayIndexOutOfBoundsException"
            int a = Integer.parseInt(ip);  // NumberFormatException
            b = 10/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of Program");
    }
}
