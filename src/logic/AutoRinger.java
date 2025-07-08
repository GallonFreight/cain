package logic;

/**
 * Ringer implementation that makes associated bell strike
 * at exactly the time it is told to
 *
 */
public class AutoRinger implements Ringer {

    private final Bell bell;

    public AutoRinger(Bell bell) {
        this.bell = bell;
    }

    public void ring() {
        bell.ring();
    }
}
