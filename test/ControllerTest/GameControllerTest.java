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

    @Test
    public void ShouldShowStartUpMessagesAndReturn2WhenInputIsToQuit() throws IOException {
        when(view.GetStartUpInput()).thenReturn('q');
        when(view.CheckInput('q')).thenReturn(2);
        assertTrue(2 == controller.StartUpGame(game, view));
    }

    @Test
    public void ShouldCheckWhetherTheMethodsAreCalledInPlayGameMethod() throws IOException {

        when(view.GetPlayerChoice()).thenReturn(2);
        when(game.ComputerDrawStick()).thenReturn(2);

        controller.PlayGame(game, view);
        controller.StartUpGame(game, view);

        verify(game).CheckSticks();
        verify(game).DrawStick(view.GetPlayerChoice());
        verify(game).ComputerDrawStick();
        verify(view).GetComputerChoice(game.ComputerDrawStick());
        verify(view, times(3)).ShowSticks(game);
        verify(view).WrongInput();
        verify(view).UserLose();
        verify(game).OneStickLeft();
        verify(view).EndGame();

    }
}