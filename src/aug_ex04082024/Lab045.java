package aug_ex04082024;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {

        //This is using Default Constructor
        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankname);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankcode);

        //--------------------------------------------------


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank name");
        String bname = sc.next();
        System.out.println("Enter bala");
        int bal = sc.nextInt();
        System.out.println("Enter bank code");
        String bcode = sc.next();

        BankAccount ic = new BankAccount(bname, bal, bcode);

        ic.printdetails();

        //----------------------------------------------------------

        //This is using Parametrized Constructor
        BankAccount ici = new BankAccount("ICICI", 108, "ICICI004");
        System.out.println(ici.bankname);
        System.out.println(ici.balance);
        System.out.println(ici.bankcode);


        ic.printdetails();
        ba1.printdetails();



    }
}
