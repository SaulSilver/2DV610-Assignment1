package ViewTest;

import Model.Game;
import Model.Stick;
import View.Console;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Hatem on 11/16/2015.
 */
public class ConsoleTest {

    Console sut;
    Game game;
    BufferedReader input;
    PrintWriter output;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        input = mock(BufferedReader.class);
        output = mock(PrintWriter.class);
        sut = new Console(input, output);
    }

    @Test
    public void ShouldShowStartUpMessage(){
        sut.StartUp();
        verify(output).println(Console.WELCOME);
    }

    @Test
    public void ShouldShowErrorMessage(){
        sut.WrongInput();
        verify(output).println(Console.ERROR_MESSAGE);
    }

    @Test
    public void ShouldShowSticks(){
        final String defaultStick = "IIIIIIIIIIIIIIIIIIIIII";
        sut.ShowSticks(game.StartNewGame());
        verify(output).println(defaultStick);
    }
}