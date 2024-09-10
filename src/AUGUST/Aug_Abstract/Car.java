package AUGUST.Aug_Abstract;

class Car extends Engine{

    @Override
    void start() {
        System.out.println("start the car");
    }

    @Override
    void stop() {
        System.out.println("stop the car");
    }

    @Override
    void partgearbox() {
        System.out.println("working on gear box");
    }

    @Override
    void openkeys() {
        System.out.println("open the door");
    }

    @Override
    void speed() {
        System.out.println("Speed of the Car");
    }
}
