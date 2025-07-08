package logic;

/**
 * Responsible for simulating the ringing of an entire composition
 *
 */
public interface Band {

    /**
     * Causes a simulation of ringing to start
     *
     */
    void ring();

    /**
     * Causes instance to stop ringing changes
     * once the current row has finished being rung
     *
     */
    void finishChanges();

}
