package com.zzxx.holiday1;

public class S extends CellFamily {
    public S(int row, int col) {
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row + 1, col);
        cells[3] = new Cell(row + 1, col - 1);
    }
}
