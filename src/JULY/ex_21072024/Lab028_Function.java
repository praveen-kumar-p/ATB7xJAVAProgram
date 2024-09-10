package JULY.ex_21072024;

public class Lab028_Function {
    public static void main(String[] args) {

        //What is function - Block of code which we can reuse
        //Functions are of two types --> 1. Pre-built  2. User created/defined

        //Two Components of functions
        // 1. Define
        // 2. Call the function

        // 2. Call the function

//        for (int i=0; i<5;i++) {
//            greet();
//        }
//        greet2();
//
//
//
//    }
        // 1. Define
        //Here "VOID" means it return anything
//    static void greet() {
//        System.out.println("Hi, How are you");
//    }
//    static void greet2(){
//        System.out.println("Greet2");

        // 1. without parameter and without return type
        // 2. without parameter but with return type
        // 3. with parameter and without return type
        // 4. with parameter and with return type

        function_type1();  //It will not return anything because of "Void"

        System.out.println("---------------------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("----------------------");

        function_type3("Praveen");

        System.out.println("----------------------");

        int sum = function_type4(4, 5);
        System.out.println(sum);

    }
    static void function_type1() {
        System.out.println("without parameter and without return type");

    }
    static String function_type2() {
        System.out.println("without parameter but with return type");
        return "Praveen";


    }
    static void function_type3(String name) {
        System.out.println("with parameter and without return type");
        System.out.println("You have shared -> " + name);

    }
    //with parameter and with return type
    static int function_type4(int a, int b){
        System.out.println("with parameter and with return type");
        return a+b;
    }
}
