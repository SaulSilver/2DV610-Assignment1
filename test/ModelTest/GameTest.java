package ModelTest;

import Model.Game;
import Model.Stick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Hatem on 11/12/2015.
 */
public class GameTest {

    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void ShouldStartAGame() {
        char[] sticks = new char[22];
        for(int i = 0; i < sticks.length; i++) {
            sticks[i] = 'I';
        }
        assertArrayEquals(sticks, game.StartNewGame());

    }
}