package devices;

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
        System.out.println("어댑터로 충전");
    }

    @Override
    public void enter() {
        System.out.println("노트북 키보드로 입력");
    }

    @Override
    public void turnOn() {
        System.out.println("노트북 전원 켜기");
    }
}
