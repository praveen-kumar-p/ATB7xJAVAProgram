package PracticeJava;


// Encapulation

public class Lab068 {
    public static void main(String[] args) {
        vwologin login = new vwologin("admin", "admin123");
        System.out.println(login.getPassword());
        login.setPassword("sapna123");
        System.out.println(login.getPassword());
    }
}

class vwologin{

    // if Data Members are in "public" then able to access

    // if the Data Members are "private" then we can
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}