package aug_ex04082024;

public class BankAccount {
    String bankname;
    int balance;
    String bankcode;


    BankAccount() {
        bankname = "HDFC";
        balance = 0;
        bankcode = "HDFV001";
    }

    BankAccount(String bname, int bal, String bcode) {
        bankname = bname;
        balance = bal;
        bankcode = bcode;
    }

    void  printdetails(){
        System.out.println("Bankname --> " + bankname);
        System.out.println("Bankbalance --> " + balance);
        System.out.println("Bankcode --> " + bankcode);
    }
}
