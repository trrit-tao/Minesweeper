package minesweeper.Cell;

public class Frames extends Cell{

    public Frames() {
        super(" ");
    }

    @Override
    public boolean alreadyOpen() {
        return true;
    }
}
