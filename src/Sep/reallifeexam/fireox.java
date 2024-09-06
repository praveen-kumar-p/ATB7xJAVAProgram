package Sep.reallifeexam;

class fireox extends baseclass{

    void display(){
        openbrowser();
        closebrowser();
        takescreenshot();
    }
    @Override
    void openbrowser() {
        System.out.println("open the firefox");
    }

    @Override
    void closebrowser() {
        System.out.println("close the firefox");
    }

    @Override
    void takescreenshot() {
        System.out.println("takescreen firefox");
    }
}
