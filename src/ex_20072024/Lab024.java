package ex_20072024;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        //Take a user input as char and tell the user if it is vowel or no
        //VOWELS --> A, E, I, O, U and a, e, i, o, u

        Scanner sc = new Scanner(System.in);
        System.out.println("user input as char and tell the user if it is vowel or no");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
            break;
            case 'e':
                System.out.println("Vowel");
            break;
            case 'i':
                System.out.println("Vowel");
            break;
            case 'o':
                System.out.println("Vowel");
            break;
            case 'u':
                System.out.println("Vowel");
            break;
            default:
                System.out.println("Not a vowel");
        }


        //Method 2
        switch (user_input){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Not a vowels");
        }

    }
}
