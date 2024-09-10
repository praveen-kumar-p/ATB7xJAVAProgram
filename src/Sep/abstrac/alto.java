package Sep.abstrac;

class alto extends engine{

    void drive(){
        openkeys();
        start();
        gear();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("alto open");
    }

    @Override
    void stop() {
        System.out.println("alto stop");
    }

    @Override
    void speed() {
        System.out.println("alto speed --> " + 120);
    }

    @Override
    void gear() {
        System.out.println("alto gear");
    }

    @Override
    void openkeys() {
        System.out.println("alto open");
    }
}
