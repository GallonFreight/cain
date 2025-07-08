package logic;

public class AutoRinger implements Ringer {

    private final Bell bell;

    public AutoRinger(Bell bell) {
        this.bell = bell;
    }

    public void ring() {
        bell.ring();
    }
}
