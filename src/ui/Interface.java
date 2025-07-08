package ui;

import logic.Call;

public interface Interface {

    void call(Call call);

    void ring(byte[] sound);

    void display(char symbol);

    void startNewRow();

}
