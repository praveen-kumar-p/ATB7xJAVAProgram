package Sep.reallifeexam;

class chrome extends baseclass{

    void display(){
        openbrowser();
        closebrowser();
        takescreenshot();
    }
    @Override
    void openbrowser() {
        System.out.println("Open the chrome");
    }

    @Override
    void closebrowser() {
        System.out.println("close chrome");
    }

    @Override
    void takescreenshot() {
        System.out.println("Take screen shot");
    }
}
