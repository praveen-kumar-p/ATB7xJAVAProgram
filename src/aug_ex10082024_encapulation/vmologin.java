package aug_ex10082024_encapulation;

public class vmologin {

    private String username;
    private String password;
    private String submitbutton;

    public vmologin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSubmitbutton() {
        return submitbutton;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
