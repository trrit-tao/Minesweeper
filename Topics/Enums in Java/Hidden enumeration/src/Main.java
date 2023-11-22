public class Main {

    public static void main(String[] args) {
        enum Direction {
            EAST("E"),
            NORTH("N"),
            SOUTH("S"),
            WEST("W");

            private final String shortCode;

            Direction(String code) {
                this.shortCode = code;
            }

            public String getShortCode() {
                return this.shortCode;
            }
        }
    }
}



