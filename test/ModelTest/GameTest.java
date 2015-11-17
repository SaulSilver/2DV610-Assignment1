package ModelTest;

import Model.Game;
import Model.Stick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hatem on 11/12/2015.
 */
public class GameTest {

    Game sut;

    @Before
    public void setUp() throws Exception {
        sut = new Game();
    }

    @Test
    public void ShouldStartAGame() {
        Stick[] DefaultSticks = new Stick[22];
        for(int i = 0; i<DefaultSticks.length; i++) {       //Making a standard Stick array to compare to
            Stick a_stick = new Stick();
            DefaultSticks[i] = a_stick;
        }

        Stick[] toBeTested = sut.StartNewGame();
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
        sut.StartNewGame();
        assertTrue(sut.DrawStick(2));
    }

    @Test
    public void ShouldComputerDrawSticks(){
        sut.StartNewGame();
        assertTrue("Computer draw must be more than 0", sut.ComputerDrawStick() > 0);
        assertTrue("Computer draw must be less than or equal to 3", sut.ComputerDrawStick() <= 3);
    }

}