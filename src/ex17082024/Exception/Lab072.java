package ex17082024.Exception;

public class Lab072 {
    public static void main(String[] args) {

        System.out.println("Start of Program");
        try {
            String s = "Pramod";
            String ip = args[0];  //"ArrayIndexOutOfBoundsException"
            int b = 10/0;
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program");
    }
}
