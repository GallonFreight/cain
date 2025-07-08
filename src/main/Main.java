package main;

import java.util.*;
import logic.*;
import ui.*;

public class Main {

    public static void main(String[] args) {
        Interface ui = new ConsoleUI();

        List<Collection<Integer>> placeNotation =
            new ArrayList<Collection<Integer>>();
        Collection<Integer> change;
        // iterate over each change
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                change = new HashSet<Integer>(0);
                placeNotation.add(change);
            } else {
                change = new HashSet(2);
                change.add(Integer.valueOf(1));
                change.add(Integer.valueOf(6));
                    // not strictly necessary,
                    // but that's how place notation is written
                placeNotation.add(change);
            }
        }
        Row rounds = new ZeroIndexedRow(ui, new int[] {0, 1, 2, 3, 4, 5});
        Composition composition =
            new PlaceNotationComposition(6, placeNotation, rounds);

        List<Ringer> ringers = new ArrayList<Ringer>(6);
        ringers.add(new AutoRinger(new SilentBell(ui, '1')));
        ringers.add(new AutoRinger(new SilentBell(ui, '2')));
        ringers.add(new AutoRinger(new SilentBell(ui, '3')));
        ringers.add(new AutoRinger(new SilentBell(ui, '4')));
        ringers.add(new AutoRinger(new SilentBell(ui, '5')));
        ringers.add(new AutoRinger(new SilentBell(ui, '6')));
        Band band = new ConcreteBand(composition, ringers);

        band.ring();
    }

}
