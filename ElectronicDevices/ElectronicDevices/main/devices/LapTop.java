public class LapTop extends Computer {
    private static LapTop lt;

    private LapTop() {

    }

    public static LapTop getLt() {
        if (lt == null) {
            lt = new LapTop();
        }
        return lt;
    }

    @Override
    public void charge() {

    }

    @Override
    public void enter() {

    }

    @Override
    public void turnOn() {

    }
}
