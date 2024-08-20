package PracticeJava;


// Encapulation

public class Lab068 {
    public static void main(String[] args) {
        vwologin login = new vwologin("admin", "admin123");
        System.out.println(login.getPassword());
        login.setPassword("sapna123", true);
        login.setUsername("praveen");
        System.out.println(login.getPassword());
        System.out.println(login.getUsername());
    }
}

// Data Members should be Private
// Methods should be Public
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

    public void setPassword(String password, boolean isAuut) {
        if (isAuut){
            this.password = password;
        }else {
            System.out.println("not allowed");
        }

    }

    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}