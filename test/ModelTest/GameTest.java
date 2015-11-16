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
        Stick[] DefaultSticks = new Stick[22];
        for(int i = 0; i<DefaultSticks.length; i++) {       //Making a standard Stick array to compare to
            Stick a_stick = new Stick();
            DefaultSticks[i] = a_stick;
        }

        Stick[] toBeTested = game.StartNewGame();
        boolean flag = false;

        for(int i = 0; i < DefaultSticks.length; i++){
            if (DefaultSticks[i].getStick() == toBeTested[i].getStick() && i == DefaultSticks.length - 1){  //If both arrays are equal
                flag = true;
                assertTrue(flag);
            }
            else if(DefaultSticks[i].getStick() != toBeTested[i].getStick()){
                assertTrue(flag);
            }
        }

    }

    @Test
    public void ShouldDrawSticks(){
        game.StartNewGame();
        assertTrue(game.DrawStick(2));
    }

    @Test
    public void ShouldComputerDrawSticksMoreThanZero(){
        game.StartNewGame();
        assertTrue("Computer draw must be more than 0",game.ComputerDrawStick() > 0);
    }

}