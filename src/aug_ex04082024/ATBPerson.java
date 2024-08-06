package aug_ex04082024;

public class ATBPerson {

    String name;
    long phone;

    ATBPerson(){
        System.out.println("object is started");
    }

    ATBPerson(String namegiven){
        this.name = namegiven;
    }

    ATBPerson(String namegiven, long phoneno){
        this.name = namegiven;
        this.phone = phoneno;
    }
}
