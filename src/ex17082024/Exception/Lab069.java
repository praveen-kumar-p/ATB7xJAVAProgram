package ex17082024.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab069 {
    public static void main(String[] args) {

        System.out.println("Start of Program");
        // Checked - JVM knows

//        try {
//            FileInputStream file = new FileInputStream("C;//log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        //Unchecked -- JVM not known

        int a = 0;
        int b = 0;
        try {
            b = 10/a;
        } catch (Exception e) {
            System.out.println("Error / by Zero");
            System.out.println(e.getMessage());
            System.out.println("End of Program");
        }
    }
}
