package AUGUST.aug_ex10082024_encapulation;

public class Test {
    public static void main(String[] args) {

        Lab049 n = new Lab049("Karnataka", "Vijayanagara");
        System.out.println(n.getState());
        System.out.println(n.getDistrict());


        System.out.println("-----------------------------------------------");

        Lab049 p = new Lab049("Karnataka", "Hospete");
        p.setDistrict("Gadag", true);
        System.out.println(p.getDistrict());
        System.out.println(p.getState());
    }
}
