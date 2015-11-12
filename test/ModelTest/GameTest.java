package ModelTest;

import Model.Game;
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
        game = mock(Game.class);
    }

    @Test
    public void ShouldStartsAGame() {
        assertTrue(game.StartNewGame());
    }
}