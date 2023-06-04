package devices;

public class Run {
    public static void main(String[] args) {
        DeskTop dt = DeskTop.getDt();
        LapTop lt = LapTop.getLt();
        FeaturePhone fp = FeaturePhone.getFp();
        SmartPhone sp = SmartPhone.getsPhone();

        System.out.println("===데스크탑 기능===");
        dt.charge();
        dt.enter();
        dt.turnOn();

        System.out.println("\n===랩탑 기능===");
        lt.charge();
        lt.enter();
        lt.turnOn();

        System.out.println("\n===피쳐폰 기능===");
        fp.charge();
        fp.enter();
        fp.call();

        System.out.println("\n===스마트폰 기능===");
        sp.charge();
        sp.enter();
        sp.call();
    }
}
