package aug_ex04082024.cop;

public class HeadPolice {

    private int gun;
    private String idcard;

    public HeadPolice(int gun){
        this.gun = gun;
    }
    protected void shoot(){
        System.out.println("Yes, You can shoot");
    }
}
