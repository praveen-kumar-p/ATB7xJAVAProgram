package Interface.multiple.exp2;

public class car implements engine{
    @Override
    public void startengine() {

    }

    @Override
    public void stopengine() {

    }

    @Override
    public void enginejuststart() {
        engine.super.enginejuststart();
    }

    @Override
    public void stopjustengine() {
        engine.super.stopjustengine();
    }
}
