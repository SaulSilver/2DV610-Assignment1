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

    @Before
    public void setUp() throws Exception {
        stick = mock(Stick.class);
    }

    @Test
    public void ShouldReturnCharacterI() {
        when(stick.getChar()).thenReturn('I');
        assertTrue('I' == stick.getChar());
    }
}