package chess;

/**
 * Which side of the board is being played
 */
public enum Player {
    White, Black;

    /**
     * Get the other player
     * @return If this enum is White, return Black.  If this enum is Black, return white.
     */
    public Player other() {
        if (this.equals(White)) {
            return Black;
        } else {
            return White;
        }
    }
}
