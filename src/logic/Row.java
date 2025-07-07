package logic;

import java.util.Collection;

public interface Row {

    void permute(Collection<Integer> change);

    void ring(Ringer[] ringers);
}
