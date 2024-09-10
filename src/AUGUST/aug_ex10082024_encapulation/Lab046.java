package AUGUST.aug_ex10082024_encapulation;


//Here we should not change the password in encapulatio

public class Lab046 {
    public static void main(String[] args) {
        VWOLogin login = new VWOLogin("praveen", "Praveen018");
        System.out.println(login.password);
        login.password = "123";
        System.out.println(login.password);
    }

}
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}