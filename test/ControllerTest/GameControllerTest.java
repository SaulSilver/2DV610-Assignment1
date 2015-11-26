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

    GameController sut;
    Console view;
    Game  game;

    @Before
    public void setUp() throws Exception {
        view = mock(Console.class);
        game = mock(Game.class);
        sut = new GameController();
    }

    @Test
    public void ShouldShowStartUpMessagesAndReturn1WhenInputIsToPlay() throws IOException {
        when(view.GetStartUpInput()).thenReturn('p');
        when(view.CheckInput('p')).thenReturn(1);
        assertTrue(1 == sut.StartUpGame(game, view));
    }

    @Test
    public void ShouldShowStartUpMessagesAndReturn2WhenInputIsToQuit() throws IOException {
        when(view.GetStartUpInput()).thenReturn('q');
        when(view.CheckInput('q')).thenReturn(2);
        assertTrue(2 == sut.StartUpGame(game, view));
    }

    @Test
    public void ShouldCheckWhetherTheMethodsAreCalledInPlayGameMethod() throws IOException {

        when(view.GetStartUpInput()).thenReturn('p');
        when(view.CheckInput('p')).thenReturn(1);
        when(view.GetPlayerChoice()).thenReturn(2);
        when(game.DrawStick(2)).thenReturn(true).thenReturn(false);
        when(game.ComputerDrawStick()).thenReturn(2);
        when(game.CheckSticks()).thenReturn(true).thenReturn(true).thenReturn(false);

        sut.PlayGame(game, view);

        verify(game, times(3)).CheckSticks();
        verify(game, times(2)).DrawStick(view.GetPlayerChoice());
        verify(game).ComputerDrawStick();
        verify(view).GetComputerChoice(game.ComputerDrawStick());
        verify(view, times(2)).ShowSticks(game);
        verify(view).WrongInput();
        verify(game).OneStickLeft();
        verify(view).EndGame();
    }
}