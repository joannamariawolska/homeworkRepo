package lesson5task5;

public class Bicycle extends Vehicle {

    public Bicycle(boolean engineStarted) {
        super(engineStarted);
    }

    @Override
    protected void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

    @Override
    protected void stopEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
}