package JULY.ex_14072024;

public class Lab013 {

    public static void main(String[] args) {

//        short p = 10;     //INTERVIEW QUESTION
//        char c = 'A';
//        int s = p+c;
//        System.out.println(s);

//        Type Casting --> Source type is not same as destination type,
//        Then source type must be converted to destination type
        //This is called Implicit Casting
//        Widening --> Converting Lower Type to higher type, Is safe conversion
//        byte b = 10;
//        int i = (int)b;

//

//        This is called Narrowing casting --> Memory loss so Not safe
//        int v = 300;
////        byte n = v;  //Invalid - Implicit casting
//        byte m = (byte)v;
//        System.out.println(m);

//        This is called Narrowing casting
//        long phone = 9972944018L;
//        short s = (short)phone;
//        System.out.println(s);

//        This is called Narrowing casting
        int course = 100;
        float gst = 18.45F;
        int sum = course + (int)gst; //Without decimal point
        float sum1 = course + gst;    //With Decimal point
        System.out.println(sum);
        System.out.println(sum1);

    }
}
