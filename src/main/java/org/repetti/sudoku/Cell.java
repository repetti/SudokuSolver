package org.repetti.sudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 17/04/15
 * Time: 16:54
 *
 * @author repetti
 */
public class Cell {
    private final List<Value> possibilities;
    private final int x, y;
    private Value value;

    public Cell(int x, int y, Value value) {
        this.x = x;
        this.y = y;
        this.value = value;
        possibilities = null;
    }

    public Cell(int x, int y, List<Value> possibilities) {
        this.x = x;
        this.y = y;
        this.possibilities = new ArrayList<Value>(possibilities);
    }

    public int getSize() {
        if (hasValue()) {
            return 0;
        }
        return possibilities.size();
    }

    public boolean hasValue() {
        return value != null;
    }

    public boolean removePossibility(Value value) {
        if (!possibilities.remove(value)) {
            return false;
        }
        if (possibilities.size() == 1) {
            value = possibilities.get(0);
        }
        return true;
    }
}
