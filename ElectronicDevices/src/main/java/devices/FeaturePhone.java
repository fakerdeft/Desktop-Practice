package devices;

public class FeaturePhone extends Phone {
    private static FeaturePhone fp;

    private FeaturePhone() {
    }

    public static FeaturePhone getFp() {
        if (fp == null) {
            fp = new FeaturePhone();
        }
        return fp;
    }

    @Override
    public void charge() {
        System.out.println("충전");
    }

    @Override
    public void enter() {
        System.out.println("눌러서 입력");
    }

    @Override
    public void call() {
        System.out.println("전화하기");
    }
}
