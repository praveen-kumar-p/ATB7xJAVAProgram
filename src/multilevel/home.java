package multilevel;

public class home {
    public static void main(String[] args) {

        son s = new son();
        s.home();
        s.fhome();
        s.ownhome();

        System.out.println("-----------------------");

        father f = new son();
        f.home();
        f.home();

        System.out.println("-----------------------");

        grandfather g = new grandfather();
        g.home();

    }
}
