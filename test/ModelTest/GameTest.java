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
        Stick[] sticks = new Stick[22];
        for(Stick stick : sticks)
            stick = new Stick();
        assertArrayEquals(sticks, game.StartNewGame());

    }

    @Test
    public void ShouldDrawSticks(){
        assertTrue(game.DrawStick(2));
    }
}