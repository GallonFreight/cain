package logic;

import java.util.*;
import ui.Interface;

public class PlaceNotationComposition implements Composition {

    private final int stage;
    private final List<Collection<Integer>> changes;
    private final Row row;
    private int changeNumber;

    /**
     * @param changes: a sequence of sets, each representing a change.
     * The members of each set are the numbers which would appear in the place
     * notation for the corresponding change
     *
     */
    public PlaceNotationComposition(
                               int stage,
                               List<Collection<Integer>> changes,
                               Row initialRow
                               ) {
        this.stage = stage;
        this.changes = changes;
        row = initialRow;
        changeNumber = 0;
    }

    public void change(Band band) {
        if (changeNumber < changes.size()) {
            row.permute(changes.get(changeNumber));
            changeNumber++;
        } else {
            band.finishChanges();
        }
    }

    public Row currentRow() {
        return row;
    }

    public int stage() {
        return stage;
    }
}
