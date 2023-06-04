package devices;

public abstract class Phone implements Device {
    @Override
    public abstract void charge();

    @Override
    public abstract void enter();

    public abstract void call();
}
