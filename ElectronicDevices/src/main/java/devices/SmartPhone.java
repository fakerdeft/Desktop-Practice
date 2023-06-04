package devices;

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
        System.out.println("고속 충전");
    }

    @Override
    public void enter() {
        System.out.println("터치로 입력");
    }

    @Override
    public void call() {
        System.out.println("보이스톡");
    }
}
