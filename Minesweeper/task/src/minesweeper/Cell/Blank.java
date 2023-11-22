package minesweeper.Cell;

public class Blank extends Cell{

    public Blank() {
        super( "/");
    }

    @Override
    public void open() throws Exception {
        super.open();
        for (Cell cell : cellsAround) {
            if (cell.alreadyOpen()) {
                continue;
            }
            cell.open();
        }
    }
}
