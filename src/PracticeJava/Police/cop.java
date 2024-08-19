package PracticeJava.Police;

public class cop {

    private String name;
    private int bullets;

    public cop(int bullets) {
        this.bullets = bullets;
    }

    protected void canoshoot(){
        System.out.println("yes u can shoot");
    }
}
