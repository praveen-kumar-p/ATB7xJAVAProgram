package Sep.overloading;

public class mathmain {
    public static void main(String[] args) {

        maths m = new maths();
        int res = m.add(10,8);
        double res1 = m.add(2.4,10.5);
        String res3 = m.add("praveen ", "iyli");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res3);
    }
}
