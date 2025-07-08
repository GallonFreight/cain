package logic;

import ui.Interface;
import java.util.List;

public class ConcreteBand implements Band {

    private final Composition composition;
    private final List<Ringer> ringers;
    private boolean inChanges;

    public ConcreteBand(Composition composition, List<Ringer> ringers) {
        this.composition = composition;
        this.ringers = ringers;
        inChanges = true;
    }

    public void ring() {
        Row initialRow = composition.currentRow();
        // ring HBHB in starting row
        initialRow.ring(ringers);
        initialRow.ring(ringers);
        initialRow.ring(ringers);
        initialRow.ring(ringers);
        while (inChanges) {
            composition.change(this);
            composition.currentRow().ring(ringers);
        }
    }

    public void finishChanges() {
        inChanges = false;
    }
}
