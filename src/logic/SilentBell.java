package logic;

import ui.Interface;

/**
 * Bell implementation that triggers no audio output
 *
 */
public class SilentBell implements Bell {

    private final Interface ui;
    private final char symbol;

    public SilentBell(Interface ui, char symbol) {
        this.ui = ui;
        this.symbol = symbol;
    }

    public void ring() {
        ui.display(symbol);
    }
}
