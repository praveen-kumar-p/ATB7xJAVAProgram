package Sep;

public class Encapulation {

    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno, boolean admin) {
        if (admin){
            this.rollno = rollno;
        }else {
            System.out.println("not allowed to set rollno");
        }
    }

    public Encapulation(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;


    }
}
