package ControllerTest;

import Controller.GameController;
import Model.Game;
import View.Console;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by Hatem on 11/23/2015.
 */
public class GameControllerTest {

    GameController controller;
    Console view;
    Game  game;

    @Before
    public void setUp() throws Exception {
        view = mock(Console.class);
        game = mock(Game.class);
        controller = new GameController();
    }

    @Test
    public void ShouldShowStartUpMessagesAndReturn1WhenInputIsToPlay() throws IOException {
        when(view.GetStartUpInput()).thenReturn('p');
        when(view.CheckInput('p')).thenReturn(1);
        assertTrue(1 == controller.StartUpGame(game, view));

    }
}