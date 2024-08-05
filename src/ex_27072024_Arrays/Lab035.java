package ex_27072024_Arrays;

public class Lab035 {
    public static void main(String[] args) {

        String s1 = new String("pramod"); // Heap Area
        String s2 = "pramod"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length()); //Returns the length of the string.
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase()); //Converts all of the characters in this string to lower case.
        System.out.println(s1.toUpperCase());  //Converts all of the characters in this string to upper case.
     }
}
