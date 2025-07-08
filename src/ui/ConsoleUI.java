package ui;

import logic.Call;

/**
 * Interface implementation that displays each row
 * as a sequence of each bell's symbol, in order
 * on a new line of console output
 *
 */
public class ConsoleUI implements Interface {

    public void call(Call call) {
    }

    public void ring(byte[] sound) {
    }

    public void display(char symbol) {
        System.out.print(symbol);
    }

    public void startNewRow() {
        System.out.println();
    }
}
