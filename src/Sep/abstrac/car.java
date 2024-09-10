package Sep.abstrac;

class car extends engine{

    void drive(){
        openkeys();
        start();
        gear();
        speed();
        stop();
    }
    @Override
    void gear() {
        System.out.println("change the gear");
    }

    @Override
    void openkeys() {
        System.out.println("Put the Key and statr");
    }

    @Override
    void start() {
        System.out.println("Start the Engine");
    }

    @Override
    void stop() {
        System.out.println("Stop the engine");
    }

    @Override
    void speed() {
        System.out.println(120);
    }
}