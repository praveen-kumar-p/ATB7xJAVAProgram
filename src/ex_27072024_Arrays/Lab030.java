package ex_27072024_Arrays;

import java.util.Scanner;

public class Lab030 {
    public static void main(String[] args) {

        //Another way to create Arrays
        int[] marks = new int[3];
        // int[3] = Index = 0,1,2
        // int[3] = length = 1,2,3

        marks[1] = 91;
        marks[0] = 95;
        marks[2] = 88;
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[0]);

        //using scaneer class

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
        //output not given

        //Boolean type array
        boolean[] is_married = {true, false, true};
        for (int i = 0; i <is_married.length; i++) {
            System.out.println(is_married[i]);
        }

        for (int i = 0; i <marks.length ; i++) {
//            System.out.println(i);
            //the output
            //0
            //1
            //2

//            System.out.println(marks[i]);
            //95
            //91
            //88

            System.out.println(i + " --> "+ marks[i]);
            //0 --> 95
            //1 --> 91
            //2 --> 88
        }
    }
}
