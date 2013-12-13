package chess;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Unit Tests for the Chess class
 */
public class ChessTest {

    private Chess chess;

    @Before
    public void setUp() {
        chess = new Chess();
    }

    @Test
    public void testInitialization() {
        assertNotNull("Game state should exist", chess.getGameState());
        assertNotNull("Chess board should exist", chess.getBoard());
    }
}
