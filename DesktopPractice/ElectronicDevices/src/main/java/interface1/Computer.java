package interface1;

public abstract class Computer implements Device {
    @Override
    public abstract void charge();

    @Override
    public abstract void enter();

    public abstract void turnOn();
}
