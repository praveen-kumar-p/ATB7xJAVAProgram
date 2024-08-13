package Aug_Abstract;

public class WagonR extends Engine{
    void drive(){
        openkeys();
        start();
        speed();
        partgearbox();
        stop();


    }

    @Override
    void start() {
        System.out.println("Start Wagonr");
    }

    @Override
    void stop() {
        System.out.println("Stop the wagonr");
    }

    @Override
    void speed() {
        System.out.println("Wagon speed is 190");
    }

    @Override
    void partgearbox() {
        System.out.println("Change the gear");
    }

    @Override
    void openkeys() {
        System.out.println("open the door of wagonr");
    }
}
