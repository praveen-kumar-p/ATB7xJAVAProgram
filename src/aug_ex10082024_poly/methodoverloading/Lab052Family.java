package aug_ex10082024_poly.methodoverloading;

public class Lab052Family {
    public static void main(String[] args) {

        Family f = new Family("Prakash", "Vittappa");
        String result1 = f.add("Praveen", "Kumar");
        int result2 = f.add(01, 01);
        String result3 = f.add("Prakash ", "Shantha");


        System.out.println(f.getName());
        System.out.println(f.getName1());


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
