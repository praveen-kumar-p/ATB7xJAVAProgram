package ex_20072024;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {

        //Grade Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            char grade = 'A';
            System.out.println("grade a");
        } else if (score >= 80 && score <= 90) {
            char grade = 'B';
            System.out.println("grade B");
        }
        System.out.println("Your grade is --> not matching");
    }
}
