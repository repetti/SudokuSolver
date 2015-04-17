package org.repetti.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Date: 17/04/15
 * Time: 16:54
 *
 * @author peter
 */
public class Cell {
    private Value value;
    private final List<Value> possibilities;

    public Cell(Value value) {
        this.value = value;
        possibilities = null;
    }

    public Cell(List<Value> possibilities) {
        this.possibilities = new ArrayList<Value>(possibilities);
    }

    public boolean hasValue() {
        return value != null;
    }

    public int getSize() {
        if (hasValue()) {
            return 0;
        }
        return possibilities.size();
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
