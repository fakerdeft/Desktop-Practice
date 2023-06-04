public class SmartPhone extends Phone {
    private static SmartPhone sp;

    private SmartPhone() {
    }

    public static SmartPhone getsPhone() {
        if (sp == null) {
            sp = new SmartPhone();
        }
        return sp;
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
