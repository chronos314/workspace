package com.zzxx.holiday1;

public class Z extends CellFamily{
    public Z(int row,int col){
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row + 1, col+1);
        cells[3] = new Cell(row + 1, col +2);
    }
}
