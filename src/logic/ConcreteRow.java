package logic;

import java.util.Collection;

public class ConcreteRow implements Row {

    private int[] order;

    public ConcreteRow(int[] initialOrder) {
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

    public void ring(Ringer[] ringers) {

    }

    private void swap(int index) {
        // swap the numbers at index and index+1
        int temp = order[index];
        order[index] = order[index + 1];
        order[index + 1] = order[index];
    }
}
