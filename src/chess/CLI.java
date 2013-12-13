package chess;

import java.io.*;

/**
 * This class provides the basic CLI interface to the Chess game.
 */
public class CLI {
    private final BufferedReader inReader;
    private final PrintStream outStream;

    private Chess chess;

    public CLI(InputStream inputStream, PrintStream outStream) {
        this.inReader = new BufferedReader(new InputStreamReader(inputStream));
        this.outStream = outStream;
    }

    private void writeOutput(String str) {
        this.outStream.println(str);
    }

    /**
     * Retrieve a string from the console, returning after the user hits the 'Return' key.
     * @return The input from the user, or an empty-length string if they did not type anything.
     */
    private String getInput() {
        try {
            return inReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read from input: ", e);
        }
    }

    private boolean isGameStarted() {
        return chess != null;
    }

    private void promptForInput() {
        if (isGameStarted()) {
            writeOutput(chess.getGameState().getCurrentPlayer() + "'s Move: ");
        } else {
            writeOutput("Type 'help' for help.");
        }
    }

    private void startEventLoop() {
        // this is our current very rudimentary event loop:
        while (true) {
            promptForInput();
            String input = getInput();

            if (input == null) {
                break;
            } else if (input.length() > 0) {
                if (input.equals("help")) {
                    showCommands();
                } else if (input.equals("new")) {
                    chess = new Chess();
                    showBoard();
                } else if (input.equals("quit")) {
                    writeOutput("Goodbye!");
                    System.exit(0);
                } else if (input.equals("board")) {
                    showBoard();
                } else if (input.equals("list")) {
                    writeOutput("Not Yet Implemented");
                } else if (input.startsWith("move ")) {
                    writeOutput("Not Yet Implemented");
                } else {
                    writeOutput("Sorry -- didn't understand that.  ");
                }
            }
        }    }

    private void showBoard() {
        if (isGameStarted()) {
            writeOutput(chess.getBoard().asString());
        } else {
            writeOutput("No game in progress.  Use 'new' to create a new game.");
        }
    }

    private void showCommands() {
        writeOutput("Possible commands: ");
        writeOutput("    'help'                       Show this menu");
        writeOutput("    'quit'                       Quit Chess");
        writeOutput("    'new'                        Create a new game");
        writeOutput("    'board'                      Show the chess board");
        writeOutput("    'list'                       List all possible moves");
        writeOutput("    'move <colrow> <colrow>'     Make a move");
    }

    public static void main(String[] args) {
        CLI cli = new CLI(System.in, System.out);
        cli.writeOutput("Welcome to Chess!");
        cli.startEventLoop();
    }
}
