package logic;

/**
 * Recieves instructions on correct time for associated bell to strike
 * and chooses time at which associated bell does strike
 *
 */
public interface Ringer {

    /**
     * Method to be called at the moment when the ringer
     * ought to ring their bell
     *
     */
    void ring();

}
