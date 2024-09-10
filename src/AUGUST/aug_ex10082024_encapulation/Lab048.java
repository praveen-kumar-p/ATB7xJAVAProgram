package AUGUST.aug_ex10082024_encapulation;

public class Lab048 {

    public static void main(String[] args) {

        //This will not be allowed because "Praveen is not admin"
        //Praveen can allowed to GET the Data not to set
        ICICIBank Praveen = new ICICIBank("Praveen", 100);
        System.out.println(Praveen.getName());
        System.out.println(Praveen.getBalance());


        //This is possible because "He is Admin"
        //The balance will be Overrided
        //If balance = 100, after setting it can be "5000" then the output will be "5000"
        ICICIBank admin = new ICICIBank("admin", 1000);
        admin.setBalance(5000, true);
        System.out.println(admin.getName());
        System.out.println(admin.getBalance());
    }
}
