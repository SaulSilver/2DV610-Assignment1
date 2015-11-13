package ModelTest;

import Model.Stick;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by Hatem on 11/12/2015.
 */
public class StickTest {

    Stick stick;
    Stick stick1;

    @Before
    public void setUp() throws Exception {
        stick = mock(Stick.class);
        stick1 = new Stick();
    }

    @Test
    public void ShouldReturnCharacterI() {
        when(stick.getStick()).thenReturn('I');
        assertTrue('I' == stick.getStick());
    }

    @Test
    public void ShouldReturnCharacter() {
        assertEquals("I", stick1.toString());
    }

    @Test
    public void ShouldSetCharacter(){
        stick1.setStick('-');
        assertTrue('-' == stick1.getStick());
    }
}