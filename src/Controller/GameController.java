package Controller;

import Model.Game;
import View.Console;

import java.io.IOException;

/**
 * Created by Hatem on 11/23/2015.
 */
public class GameController {
    Console m_console;

    public int StartUpGame(Game game, Console view) throws IOException {
        m_console = view;
        char input = m_console.GetStartUpInput();
        return m_console.CheckInput(input);
    }
}
