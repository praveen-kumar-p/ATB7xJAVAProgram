package AUGUST.aug_ex10082024_encapulation;

public class Lab047 {
    public static void main(String[] args) {
        VWOLogin1 login = new VWOLogin1("praveen", "Praveen018");
        System.out.println(login.getUsername());
        login.setUsername("pradeep");
        System.out.println(login.getUsername());

        //Write a code to Authenticate
        //If he is Praveen -- Then allowed
        login.setPassword("1234", true);
        System.out.println(login.getPassword());
    }

}
class VWOLogin1{
    private String username;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if (isAuth){
            System.out.println();
            this.password = password;
        }else {
            System.out.println("Not allowed");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
