package JULY.ex_14072024;

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
//        System.out.println(++a + a-- + a++);
//        System.out.println(a);


        //INTERVIEW QUESTION
//        int h = 87;
//        long g = 91;
//        String s1 = "KK";
//        String s2 = "VV";
//        System.out.println(s1+s2+h+g);
//        System.out.println(s1+h+g+s2);
//        System.out.println(s1+s2+(h+g));


        //Strings - //Bunch of characters , Collection of characters
        //Strings are IMMUTABLE [Not able to change]
//        String name = "Praveen";
//
//        String name2 = new String("Praveen");

        // Types of strings = 2
        // = , new operator
        // = "SCP" (String Constant post
        // new - Objectes(heap)

//        System.out.println(name.toLowerCase());   // This converts lowercharacters
//        System.out.println(name2.length());   // This give length of Characters
//        System.out.println(name.charAt(4));   // This give the Index

        //Interview question
//        String name = "Praveen";  // This is stored in SCP
////
//        String name2 = new String("Praveen");  // This is stored in Heap

        //Interview question
//        String s1 = "Praveen";
//        String s2 = s1;
//        System.out.println(s2);
//        String s3 = s2.toLowerCase();
//        System.out.println(s3);
//        String s4 = s2.toUpperCase();
//        System.out.println(s4);
//        String s1 = "Praveen";
//        //1 - SCP
//        String s2 = "Ranjan";
//        //2 - SCP
//        String s3 = "Sapna";
        //3 - SCP
        //    Upto this value store in SCP


//        String s4 = new String("Praveen");
//        String s5 = new String("Praveen");
        //  This will be stored in Heap location

//        String na = "Praveen";
//        String na1 = "Praveen";
//        System.out.println(na == na1);

        //INTERVIEW QUESTION
        // == -- compare the Same Location and value, checks for Refrences
        // .equals() -- Checks for content

//        //INTERVIEW QUESTION
//        String s4 = new String("Praveen");
//        String s5 = new String("Praveen");
//
//        System.out.println(s4 == s5);  // Check for Ref
//        System.out.println(s4.equals(s5));  // Check for Contect

        //INTERVIEW QUESTION
//        String r = "Praveen";
//
//        char c = r.charAt(3);
//        System.out.println(c);
//        String p = r.concat(" Iyli");  // This is not concatation [This is Assigning]
//        System.out.println(p);  //This gives the Output "Praveen Iyli"



    }
}
