package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.*;

class PlainHunt6Test {

    @Test
    void testLeadHead() {
        assertArrayEquals(
                          new int[] {1, 2, 3, 4, 5, 6},
                          new PlainHunt6().currentRow()
                          );
    }

    @Test
    void testFirstChange() {
        Composition ph = new PlainHunt6();
        ph.change();

        assertArrayEquals(
                          new int[] {2, 1, 4, 3, 6, 5},
                          ph.currentRow()
                          );
    }

    @Test
    void testLeadEnd() {
        Composition ph = new PlainHunt6();
        for (int i = 0; i < 11; i++)
            ph.change();

        assertArrayEquals(
                          new int[] {1, 3, 2, 5, 4, 6},
                          ph.currentRow()
                          );
    }
}
