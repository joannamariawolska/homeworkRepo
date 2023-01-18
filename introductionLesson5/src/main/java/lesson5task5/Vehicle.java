package lesson5task5;

public class Vehicle {

    private boolean engineStarted;

    public Vehicle(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
}