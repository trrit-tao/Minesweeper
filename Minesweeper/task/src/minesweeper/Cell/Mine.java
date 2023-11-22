package minesweeper.Cell;

public class Mine extends Cell{
    public Mine() {
        super("X");
        mine++;
    }
    @Override
    public boolean flag() {
        if (fieldPlayer.equals("*")) {
            fieldPlayer = publicMeaning;
            mineFlag++;
            return false;
        } else {
            fieldPlayer = "*";
            mineFlag--;
            return true;
        }
    }


    @Override
    public void open()  throws Exception {
        throw new Exception();

    }
}
