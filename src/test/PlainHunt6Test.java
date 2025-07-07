package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.PlainHunt6;

class PlainHunt6Test {

    @Test
    void testFirstRow() {
        assertArrayEquals(
                          new int[] {1, 2, 3, 4, 5, 6},
                          new PlainHunt6().currentRow()
                          );
    }
}
