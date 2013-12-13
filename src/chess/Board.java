package chess;


/**
 * This class represents the chess board
 */
public class Board {
    private static final String NEWLINE = System.getProperty("line.separator");

    private GameState state;

    public Board(GameState state) {
        this.state = state;
    }

    /**
     * Display the board for the user(s)
     */
    public String asString() {
        StringBuilder builder = new StringBuilder();
        builder.append("It's currently ")
                .append(state.getCurrentPlayer())
                .append("'s Move").append(NEWLINE);

        printColumnLabels(builder);

        for (int i = 8; i > 0; i--) {
            printSeparator(builder);
            printSquares(i, builder);
        }

        printSeparator(builder);
        printColumnLabels(builder);

        return builder.toString();
    }


    private void printSquares(int rowLabel, StringBuilder builder) {
        builder.append("  |   |   |   |   |   |   |   |   |").append(NEWLINE);
        builder.append(rowLabel)
               .append(" |   |   |   |   |   |   |   |   |").append(NEWLINE);
        builder.append("  |   |   |   |   |   |   |   |   |").append(NEWLINE);
    }

    private void printSeparator(StringBuilder builder) {
        builder.append("  +---+---+---+---+---+---+---+---+").append(NEWLINE);
    }

    private void printColumnLabels(StringBuilder builder) {
        builder.append("    A   B   C   D   E   F   G   H").append(NEWLINE);
    }
}
