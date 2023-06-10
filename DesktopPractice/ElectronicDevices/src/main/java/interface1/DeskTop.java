package interface1;

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
        System.out.println("파워선으로 충전");
    }

    @Override
    public void enter() {
        System.out.println("키보드로 입력");
    }

    @Override
    public void turnOn() {
        System.out.println("본체로 전원 켜기");
    }
}
