package Interface.multiple;

public class son implements father, Mother{
    @Override
    public void money() {
        System.out.println("son will pay back money");
    }

    @Override
    public void home() {
        System.out.println("son live in both father and mother home");
    }
}
