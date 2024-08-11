package aug_ex10082024_encapulation;

public class ICICIBank {

    private String name;
    private long balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin){
            this.name = name;
            System.out.println("Is Allowed");
        }else {
            System.out.println("Not allowed");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if (isAdmin){
            this.balance = balance;
            System.out.println("Is Allowed");
        }else {
            System.out.println("Not allowed");
        }

    }
}