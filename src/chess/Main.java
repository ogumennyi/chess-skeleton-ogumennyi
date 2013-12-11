package chess;

import java.io.*;

public class Main {
    private final BufferedReader inReader;
    private final PrintStream outStream;

    private Board board;

    public Main(InputStream inStream, PrintStream outStream) {
        this.inReader = new BufferedReader(new InputStreamReader(inStream));
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



    public static void main(String[] args) {
        Main chess = new Main(System.in, System.out);

        // this is our current very rudimentary event loop:
        while (true) {
            chess.writeOutput("Type 'new' to create a new chess board, or 'q' to quit: ");
            String input = chess.getInput();

            if (input.length() > 0) {
                if (input.equals("new")) {
                    chess.createNewBoard();
                    chess.showBoard();
                } else if (input.equals("q")) {
                    chess.writeOutput("Goodbye!");
                    System.exit(0);
                }
            }
        }
    }

    private void showBoard() {
        writeOutput(board.getBoard());
    }

    private void createNewBoard() {
        this.board = new Board();
    }

}
