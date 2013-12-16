package chess;


/**
 * This class represents the chess board
 */
public class Board {
    private static final String NEWLINE = System.getProperty("line.separator");

    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;
    public static final char MIN_COLUMN = 'a';
    public static final char MAX_COLUMN = 'h';

    private GameState state;

    public Board(GameState state) {
        this.state = state;
    }

    /**
     * Display the board for the user(s)
     */
    public String asString() {
        StringBuilder builder = new StringBuilder();
        builder.append("   It's currently ")
                .append(state.getCurrentPlayer())
                .append("'s Move").append(NEWLINE);

        printColumnLabels(builder);

        for (int i = MAX_ROW; i >= MIN_ROW; i--) {
            printSeparator(builder);
            printSquares(i, builder);
        }

        printSeparator(builder);
        printColumnLabels(builder);

        return builder.toString();
    }


    private void printSquares(int rowLabel, StringBuilder builder) {
        builder.append("  |   |   |   |   |   |   |   |   |").append(NEWLINE);

        builder.append(rowLabel);
        for (char c = MIN_COLUMN; c <= MAX_COLUMN; c++) {
            builder.append(" |  ");
        }
        builder.append(" | ").append(rowLabel).append(NEWLINE);

        builder.append("  |   |   |   |   |   |   |   |   |").append(NEWLINE);
    }

    private void printSeparator(StringBuilder builder) {
        builder.append("  +---+---+---+---+---+---+---+---+").append(NEWLINE);
    }

    private void printColumnLabels(StringBuilder builder) {
        builder.append("   ");
        for (char c = MIN_COLUMN; c <= MAX_COLUMN; c++) {
            builder.append(" ").append(c).append("  ");
        }

        builder.append(NEWLINE);
    }
}
