package ModelTest;

import Model.Stick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hatem on 11/12/2015.
 */
public class StickTest {

    Stick sut;

    @Before
    public void setUp() throws Exception {
        sut = new Stick();
    }

    @Test
    public void ShouldReturnCharacterI() {
        assertTrue('I' == sut.getStick());
    }

    @Test
    public void ShouldReturnCharacter() {
        assertEquals("I", sut.toString());
    }

    @Test
    public void ShouldSetCharacter(){
        sut.setStick('-');
        assertTrue('-' == sut.getStick());
    }
}