package logic;

/**
 * Responsible for sending output of simulated bell to the UI
 *
 */
public interface Bell {

    /**
     * Method to be called when UI needs to produce output
     * corresponding to the simulated bell striking
     *
     */
    void ring();

}
