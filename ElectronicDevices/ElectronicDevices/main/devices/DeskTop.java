public class DeskTop extends Computer {
    private static DeskTop dt;

    private DeskTop() {
    }

    public static DeskTop getDt() {
        if (dt == null) {
            dt = new DeskTop();
        }
        return dt;
    }

    @Override
    public void charge() {
        System.out.println();
    }

    @Override
    public void enter() {

    }

    @Override
    public void turnOn() {

    }
}
