package ex17082024.Exception;


public class Lab068 {
    public static void main(String[] args) {

        System.out.println("Start of Program");
        // Program that disrupts the normal flow of instruction
        // If not given the "args" value then we get exception "ArrayIndexOutOfBoundsException"
        String ip = args[0];  //"ArrayIndexOutOfBoundsException"

        // After converting Sting to Integer, if we pass "args" value "pramod"
        // Then we get Exception = NumberFormatException
        int a = Integer.parseInt(ip);  // NumberFormatException

        // If the "args" value we given "0"(ZERO) then we get "ArithmeticException"
        int b = 10/0;  // ArithmeticException
        System.out.println(b);
        System.out.println("End of Program");

        // JVM will be Initialized
        // Creates and Starts the main Thread. - Main Called
        // 1)Collects the Command Line Arguments
        // 2)Creates the String array with CLI
        // 3. Lab209.main(0)
        // Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.  G













    }
}
