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
        writeOutput("Welcome to Chess!");
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
            this.outStream.print("> ");
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
            writeOutput(chess.getGameState().getCurrentPlayer() + "'s Move");
        }
    }

    private void startEventLoop() {
        writeOutput("Type 'help' for a list of commands.");

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
                    writeOutput("Sorry; 'list' is not yet implemented");
                } else if (input.startsWith("move")) {
                    writeOutput("Sorry; 'move' is not yet implemented");
                } else {
                    writeOutput("I didn't understand that.  Type 'help' for a list of commands.");
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
        cli.startEventLoop();
    }
}
