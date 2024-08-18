package Interface.multiple.exp2;

public interface engine {
    void startengine();
    void stopengine();

    default void enginejuststart(){
        System.out.println("Start engine");
    }

    default void stopjustengine(){
        System.out.println("stop engine");
    }

    static void m1(){
        System.out.println("M1");
    }
}
