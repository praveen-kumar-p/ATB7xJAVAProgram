package JULY.ex_21072024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab024_for {
    public static void main(String[] args) {

        //Loops = To perform a task multiple times
        //Syntax
        //for (A ; B; C){
        //Task which you want to perform multiple times
        //}

        //A -- Initilazation
        //B -- Conditions
        //C -- Increment/Decrement -- updation

//        for (int i = 0; i < 10; i++){     //The result will be from 0 to 9
//            System.out.println("Hi --> " + i);
//        }

//        for (int i = 0; i <= 10; i++){    //The result will be from 0 to 10
//            System.out.println("Number --> " + i);
//        }

//        for (float a = 0;  a < 10.5; a++){  //The o/p will be 0 to 10
//            System.out.println("float --> " + a);
//        }

//        for (int praveen = 0; praveen < 5; praveen++){
//            System.out.println("praveen");
//        }

        //Interview Question
//        for (int _1 = 0; _1<10; _1++){
//            System.out.println("Number --> " + _1);
//        }

        //Interview Question
        //WP for print the char from 'a' to 'z'
//        for (char c = 'a'; c <= 'z'; c++){
//            System.out.println("char --> " + c);
//        }

//        for (float a=10.0f; a>0; a--){
//            System.out.println("float number --> " + a);
//        }

        //We can write the Initilazayion outside but output will not seen
//        int i = 10;
//        for ( ; i <0 ; i++){
//            System.out.println("i");
//        }

//        for (int i = 0; i > 10; i--){  //The output will br "End"
//            System.out.println("praveen");
//        }
//        System.out.println("End");

//        for (int i =0; i < 10; i++){
//            System.out.println("praveen");
//        }
//        System.out.println("End");

        //Interview Question
//        for (int i = 0; i <= 10; i++){
//            System.out.println("praveen " + i);
//        }

        //Interview Question
//        for (int p = 0; p < 10; ++p){
//            System.out.println("pradeep " + p);
//        }

//        for (int i = 0; i <= 10; i++){
//            if (i == 5){
//                System.out.println("Five");
//            }else{
//                System.out.println(i);
//            }
//        }

//        for (char c = 'a'; c <= 'z'; ++c){
//            if (c == 'p'){
//                System.out.println("Praveen");
//            } else if (c == 's') {
//                System.out.println("Sapna");
//            }else {
//                System.out.println(c);
//        }
//        }

//        for (long p = 123; p < 130l; p++){
//            System.out.println("long number" + p);
//        }

        //***IMP QUESTION**
//        for (int i = 0; i <= 8; i++){
//            System.out.println("Upto" + i);    // This will print upto "8"
//            if (i == 5){
//                break;
//            }
//        System.out.println("All number" + i);   // This will print 0 to 4 number
//        }

        //WP to print the number which are even from 0 to 20
//        for (int i = 0; i <= 20; i++){
//            if (i % 2 == 0){
//                System.out.println("Even Number" + i);
//                continue;
//            }
//            System.out.println("Odd" + i);
//        }


        //Write program for displaying "Five" times the text

//        for (int i = 1; i<=5; i++){
//            System.out.println("Praveen");
//
//        }

        //Write program to display numbers from 1 to 5
//        for (int i = 1; i<=5; i++){
//            System.out.println("Numbers --> " + i);
//        }

        //Write program to sum the n Natural numbers

//        int sum = 0;
//        int n = 50;
//        for (int i =1; i <=n; i++){
//            sum = i + n;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Sum");
//        int sum = sc.nextInt();
//
//        for (int i = 1; i <= sum; i++){
//            sum = i + sum;
//        }
//        System.out.println(sum);



        //Array program
        int[] num = {10, 15, 25, 4, 13, 7};
        int m = 1;
        for (int i = 0; i<num.length; i++){
            if (num[i]>m){
                m = num[i];
            }
        }
        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }

}
