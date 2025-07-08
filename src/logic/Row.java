package logic;

import java.util.*;

/**
 * Represents a single row of a method
 *
 */
public interface Row {

    //TODO: replace this manipulator method with a builder method:
    // Row permutation(Collection<Integer> change)
    // which returns the result of applying change to this
    // rationale: EO 2.6: Be Immutable
    void permute(Collection<Integer> change);

    /**
     * Tells the provided sequence of ringers to ring their bells
     * in the order represented by this row
     * @param ringers: a list of ringers in the order they would ring in rounds
     *
     */
    void ring(List<Ringer> ringers);
}
