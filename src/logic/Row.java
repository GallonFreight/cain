package logic;

import java.util.*;

public interface Row {

    //TODO: replace this with a method:
    // Row permutation(Collection<Integer> change)
    // which returns the result of applying change to this
    // rationale: EO 2.6: Be Immutable
    void permute(Collection<Integer> change);

    void ring(List<Ringer> ringers);
}
