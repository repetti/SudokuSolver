package org.repetti.sudoku;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Supports 9x9 fields
 *
 *
 * @author repetti
 */
public class FieldState {
    private final Cell[][] field;
    private final TreeMap<Integer, Cell> possibilities = new TreeMap<Integer, Cell>();

    public FieldState(Value[][] field) {
        this.field = new Cell[9][9];
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                final Value val = field[x][y];
                if (val == Value.UNDEFINED) {
                    this.field[x][y] = new Cell(x, y, new ArrayList<Value>());
                } else {
                    this.field[x][y] = new Cell(x, y, val);
                }
            }
        }
        fillPossibilities();
    }

    private void fillPossibilities() {

    }

}
