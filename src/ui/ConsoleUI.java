package ui;

import logic.Call;

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
