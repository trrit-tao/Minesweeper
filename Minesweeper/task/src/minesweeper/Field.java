package minesweeper;

import minesweeper.Cell.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Field {
    private final Cell[][] mineField = new Cell[11][11];
    private final Random random = new Random();


    public Field(int mines) {
        createField();
        addingMines(mines);
        addHint();
        rebutField();
    }


    public void rebutField() {
        for (int j = 1; j < mineField.length - 1; j++) {
            for (int i = 1; i < mineField.length - 1; i++) {
                mineField[j][i].setCellsAround(cellsAround(j, i));
            }
        }
    }


    public  void createField() {
        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField.length; j++){
                if (i == 0 || i == mineField.length - 1 || j == 0 || j == mineField.length - 1) {
                    mineField[i][j] = new Frames();
                }else {
                    mineField[i][j] = new Blank();
                }
            }
        }
    }



    private  List<Cell> cellsAround(int x, int y) {

        List<Cell> around = new ArrayList<>();

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (j == y && i == x) {
                    continue;
                }
                around.add(mineField[i][j]);
            }
        }
        return around;
    }



    private   void addingMines(int mine) {
        for (int i = 0; i < mine; i++) {
            int x = random.nextInt(9) + 1;
            int y = random.nextInt(9) + 1;
            if (mineField[x][y] instanceof Mine) {
                i--;
                continue;
            }
            mineField[x][y] = new Mine();
        }
    }



    public  void Display() {
        System.out.println(" |123456789|");
        System.out.println("-|---------|");
        for (int i = 1; i < mineField.length - 1; i++) {
            System.out.print(i + "|");
            for (int j = 1; j < mineField.length - 1; j++) {
                System.out.print(mineField[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-|---------|");
        System.out.println();
    }



    public void openCell(int x, int y) throws Exception {
        mineField[x][y].open();
    }



    public void useFlag(int x, int y) {
        mineField[x][y].flag();
    }



    public void loozer() {
        System.out.println(" |123456789|");
        System.out.println("-|---------|");
        for (int i = 1; i < mineField.length - 1; i++) {
            System.out.print(i + "|");
            for (int j = 1; j < mineField[i].length - 1; j++) {
                if (mineField[i][j] instanceof Mine) {
                    System.out.print("X");
                }else {
                    System.out.print(mineField[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.println("-|---------|");
        System.out.println();
        System.out.println("You stepped on a mine and failed!");
     }


    public  void addHint() {
        for (int i = 1; i < mineField.length - 1; i++) {
            for (int j = 1; j < mineField[i].length - 1; j++) {
                if (!(mineField[i][j] instanceof Mine)) {
                    int counter = 0;
                    for (Cell cell : cellsAround(i, j)) {
                        if (cell instanceof Mine) {
                            counter++;
                        }
                    } if (counter != 0) {
                        mineField[i][j] = new Hint(counter);
                    }

                }
            }
        }
    }
}
