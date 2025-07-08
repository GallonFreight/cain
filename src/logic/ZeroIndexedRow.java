package logic;

import java.util.*;
import ui.Interface;

public class ZeroIndexedRow implements Row {

    private final Interface ui;
    private int[] order;

    /**
     * @param initialOrder:
     * the permutation in which the bells start: zero-indexed
     * i.e. the treble is at the position labelled 0,
     * the position of the second is labelled 1, etc.
     *
     */
    public ZeroIndexedRow(Interface ui, int[] initialOrder) {
        this.ui = ui;
        order = initialOrder;
    }

    public void permute(Collection<Integer> change) {
        for (int i = 0; i < order.length - 1; i++) {
            // swap every pair of bells
            // unless first of the pair to be swapped
            // is in the place notation
            if (!change.contains(Integer.valueOf(i))) {
                swap(i);
                i++; // don't move the same bell twice in one change
            }
        }
    }

    public void ring(List<Ringer> ringers) {
        for (int i : order) {
            ringers.get(i).ring();
        }
        ui.startNewRow();
    }

    private void swap(int index) {
        // swap the numbers at index and index+1
        int temp = order[index];
        order[index] = order[index + 1];
        order[index + 1] = order[index];
    }
}
