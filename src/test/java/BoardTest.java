import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    Board board;

    @Before
    private void setUp() {
        board = new Board();
    }

    @Test
    private void testBoard() {
        boolean[][] maze = board.getBooLab();
        assertFalse(maze[1][1]);
        assertFalse(maze[19][38]);
        assertTrue(maze[11][4]);
        assertTrue(maze[16][6]);
    }

    @Test
    private void testBool() {

    }
}