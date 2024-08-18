package Interface;

public class Wagnor implements Engine{


    void drive() {
        startengine();
        stopengine();
    }

    @Override
    public void startengine() {
        System.out.println("wagonar start engine");
    }

    @Override
    public void stopengine() {
        System.out.println("Stop of wagonar");
    }

}
