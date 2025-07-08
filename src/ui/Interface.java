package ui;

import logic.Call;

/**
 * Interface provides methods to output sound and images
 * that represent bells striking and conductors calling
 *
 */
public interface Interface {

    void call(Call call);

    void ring(byte[] sound);

    void display(char symbol);

    void startNewRow();

}
