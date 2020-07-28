package com.zzxx.holiday1;

/**
 * T图形类:
 *  包含4个Cell
 */

public class T extends CellFamily{
    public T(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 1);
    }
}
