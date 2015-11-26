package Controller;

import Model.Game;
import View.Console;

import java.io.IOException;

/**
 * Created by Hatem on 11/23/2015.
 */
public class GameController {
    Console m_console;
    Game m_game;

    public void PlayGame(Game game, Console view) {
    }

    public int StartUpGame(Game game, Console view) throws IOException {
        m_console = view;
        m_game = game;

        m_game.StartNewGame();
        m_console.StartUp();
        m_console.ShowSticks(m_game);

        char input = m_console.GetStartUpInput();
        return m_console.CheckInput(input);
    }


}
