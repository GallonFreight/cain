package logic;

/**
 * Represents a sequence of rows to be rung
 *
 */
public interface Composition {

    /**
     * Changes the row returned by currentRow()
     * to be one row further into the composition
     * @param band: the band ringing the composition
     *
     */
    void change(Band band);

    Row currentRow();

    //TODO: consider removing this method; I don't believe it's needed
    /**
     * @return the number of bells on which the composition is rung
     * (including any cover bells)
     *
     */
    int stage();
}
