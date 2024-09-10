package AUGUST.Aug_Abstract;

public class Tesla extends Engine {
    void drive(){
        openkeys();
        start();
        partgearbox();
        stop();
        speed();

    }

    @Override
    void start() {
        System.out.println("Start the tesla");
    }

    @Override
    void stop() {
        System.out.println("Stop the tesla");
    }

    @Override
    void speed() {
        System.out.println("Tesla speed is 160");
    }

    @Override
    void partgearbox() {
        System.out.println("change the tesla gear");
    }

    @Override
    void openkeys() {
        System.out.println("Open the tesla door");
    }
}
