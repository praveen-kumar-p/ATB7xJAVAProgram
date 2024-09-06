package Sep.overloading;

public class multioveloading {

    private String name;
    private String name1;

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

    public multioveloading(String name1, String name) {
        this.name1 = name1;
        this.name = name;
    }

    String add(String a, String b){
        return a + b;
    }

    int add(int c, int d){
        return c + d;
    }
}
