package AUGUST.aug_ex10082024_encapulation;

public class Lab050 {
    public static void main(String[] args) {

        vmologin login = new vmologin("admin", "admin1");
        System.out.println(login.getUsername());
        System.out.println(login.getPassword());
        System.out.println(login.getSubmitbutton());
    }
}
