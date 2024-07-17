package ex_14072024;

public class Lab_INCEMENT_DECEMENT_014 {

    public static void main(String[] args) {
        //Increment and Decrement
        //Pre and Post

        //Pre - Increment
        //value is incremented first and then stored in the result
//        int a = 10;
//        int b = ++a;  //a = a + 10
//        //Exp = 11, a = 11
//        System.out.println(a);
//        System.out.println(b);

//        int s = 10;
//        System.out.println(++s);
        //Exp = 11, a = 11

        //Post - Increment
        //value is stored in result and incremented next
//        int p = 10;
//        System.out.println(p++);
//        System.out.println(p);
        //Exp = 10, a = 11


        //Question
        //Answer = 11 Exp = 11, r = 11
//        int r = 10;
//        int result = r++;
//        System.out.println(r);
//        System.out.println(result);

//        int g = 10;
//
//        System.out.println(++g);     //Exp = 11, g = 11 --> Pre
//
//        System.out.println(g++);    //Exp = 11, g = 10  --> Post


        int a = 10;
//        System.out.println(a++ + a);
//        System.out.println(a++ + ++a);
       //A = ++a -- Exp = 10 , a = 11
        //+ -- Operator
        // B = a++ -- Exp = 12 , a = 12
//        System.out.println(++a + ++a);  //Result = 23
//        System.out.println(a);   //Result = 10

//        System.out.println(++a + a++ + a++);
//        System.out.println(a);
        System.out.println(++a + a-- + a++);
        System.out.println(a);

    }
}
