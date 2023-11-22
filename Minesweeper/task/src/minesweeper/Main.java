package minesweeper;

import minesweeper.Cell.Cell;

import java.util.Scanner;

public class Main {
   private final static Scanner scanner = new Scanner(System.in);
   private static Field field;
   
    public static void main(String[] args) throws Exception {
        field = new Field(minInput());
        while (!Cell.checkWin()) {
            field.Display();
            System.out.println("Set/unset mines marks or claim a cell as free: ");
            int y = scanner.nextInt();
            int x = scanner.nextInt();
            switch (scanner.next()){
                case "free":
                    if(!nextRound(x,y)){
                        field.loozer();
                        return;
                    }
                    break;
                case "mine":
                    field.useFlag(x,y);
                    break;
                default:
                    System.out.println("There is a number here!");
            }
        }
        field.Display();
        System.out.println("Congratulations! You found all the mines!");
    }



    public static int minInput() {
        System.out.print("How many mines do you want on the field?");
        return scanner.nextInt();
    }



    private static boolean nextRound(int x, int y){
        try {
            field.openCell(x,y);
            return true;
        } catch (Exception e) {
            field.loozer();
            return false;
        }
    }

}