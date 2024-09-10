package AUGUST.aug_ex10082024_poly.methodoverloading;

public class Family {

    // Encapsulation
    private String name;
    private String name1;

    public Family(String name, String name1){
        this.name = name;
        this.name1 = name1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }


    // From here MethodOverLoading
    String add(String a, String b){
        return a+b;
    }

    int add(int a, int b){
        return a+b;
    }
}
