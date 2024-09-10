package AUGUST.aug_ex10082024_encapulation;

public class Lab049 {

    private String state;
    private String district;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district, boolean isAdmin) {
        if (isAdmin){
            this.district = district;
        }else {
            System.out.println("not allowed");
        }

    }

    public Lab049(String state, String district) {
        this.state = state;
        this.district = district;



    }
}