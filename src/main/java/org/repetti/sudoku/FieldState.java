package org.repetti.sudoku;

import java.util.List;
import java.util.TreeMap;

/**
 * Supports 9x9 fields
 *
 *
 * @author repetti
 */
public class FieldState {
    private final List<Integer>[][] field;
    private final TreeMap<Integer, List<int[][]>> possibilities = new TreeMap<Integer, List<int[][]>>();


    public FieldState(int[][] field) {
        this.field = new List[9][9];
        for (int i = 0; i < 9; i++) {

        }
    }


}
