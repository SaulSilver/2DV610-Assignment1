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

    private final int START = 1;
    private final int QUIT = 2;

    public void PlayGame(Game a_game, Console a_console) throws IOException {
        int response = StartUpGame(a_game, a_console);

        if(response == START)
        {
            int computerChoice = 0;
            while (m_game.CheckSticks()) {
                int sticksNumber = m_console.GetPlayerChoice();
                boolean inputIsCorrect = m_game.DrawStick(sticksNumber);

                if (inputIsCorrect) {
                    computerChoice = m_game.ComputerDrawStick();
                    m_console.GetComputerChoice(computerChoice);
                    m_console.ShowSticks(m_game);
                } else {
                    m_console.WrongInput();
                }
            }
            if (m_game.OneStickLeft() || computerChoice == 0) {
                m_console.UserLose();
            }
            else {
                m_console.EndGame();
            }
        }
        else if (response == QUIT)
        {
            System.exit(0);
        }
        else {
            PlayGame(m_game, m_console);
        }
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
