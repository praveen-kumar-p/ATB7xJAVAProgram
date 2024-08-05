package ex_28072024_OOPs;

public class Lab038 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.age = 2;
        dog1.name = "chow chow";

        Dog dog2 = new Dog();
        dog2.name = "German Shepherd";
        dog2.color = "Grey";
        System.out.println(dog1.name);


//        public static void main(String[] args) {
//            Animal animalrRef  = null;
//            Animal animalrRef2  = new Animal();
//            Animal animalrRef3  = new Animal();
//            Animal animalrRef4  = animalrRef2;
//            System.out.println(animalrRef3.name);
    }
}
