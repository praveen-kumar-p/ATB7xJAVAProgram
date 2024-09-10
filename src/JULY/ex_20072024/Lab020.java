package JULY.ex_20072024;

import java.util.Scanner;

public class Lab020 {
    public static void main(String[] args) {

        //Max number in two input
        //Method Number 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();

        System.out.println("Enter number");
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1, num2));

        //Method Number 2
//        if (num1 > num2){
//            System.out.println(num1);
//        }else {
//            System.out.println(num2);
//        }

        //Method Number 3
//        int a = 10;
//        int b = 20;
//        if (a >= b){
//            System.out.println("A is big number");
//        } else {
//            System.out.println("B is big number");
//        }

    }
}
