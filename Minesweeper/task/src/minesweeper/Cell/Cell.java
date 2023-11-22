package minesweeper.Cell;

import java.util.ArrayList;
import java.util.List;

public class Cell {
     List<Cell> cellsAround = new ArrayList<>();
    static int mine = 0;
    static int notOpenCells = 81;
    static int mineFlag = 0;
    static int notMineFlag = 0;
    final String publicMeaning = ".";
    final String privateMeaning;
    String fieldPlayer = publicMeaning;


    public Cell(String meaning) {
        privateMeaning = meaning;
    }


    public static boolean checkWin() {
        return mine == notOpenCells || (mine == mineFlag && notMineFlag == 0);
    }



    public boolean flag() {
        if (alreadyOpen()) {
            return false;
        }
        if (fieldPlayer.equals("*")) {
            fieldPlayer = publicMeaning;
            notMineFlag--;
            return false;
        } else {
            fieldPlayer = "*";
            notMineFlag++;
            return true;
        }
    }

    public void open() throws Exception {
        if (alreadyOpen()) {
            return;
        }
        fieldPlayer = privateMeaning;
        notOpenCells--;
    }



    public boolean alreadyOpen() {
        return fieldPlayer.equals(privateMeaning);
    }



    @Override
   public String toString() {
        return fieldPlayer;
    }



    public void setCellsAround(List<Cell> list) {
        cellsAround.addAll(list);
    }
}
