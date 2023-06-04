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

    }

    @Override
    public void enter() {

    }

    @Override
    public void call() {

    }
}
