package AUGUST.aug_ex10082024_poly.methodoverriding;

public class Lab053 {
    // MethodOverRiding |  Runtime Poly
    public static void main(String[] args) {

        // This will give the output "Haund"
        Haund h = new Haund();
        h.bark();

        // This will give the output "Dog"
        Dog d = new Dog();
        d.bark();

        // This will give the output "Haund"
        Dog dor_ref = new Haund();
        dor_ref.bark();

        Dog f = new Haund();
        f.bite();

    }
}
