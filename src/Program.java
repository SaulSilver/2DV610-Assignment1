import Controller.GameController;
import Model.Game;
import View.Console;

import java.io.*;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out, true);

        Game game = new Game();
        Console view = new Console(input, output);
        GameController gameController = new GameController();
        gameController.PlayGame(game, view);
    }
}
