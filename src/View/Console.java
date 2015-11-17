package View;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Created by Hatem on 11/16/2015.
 */
public class Console {
    private PrintWriter console;

    public static final String WELCOME = "Wanna play a game?\nWelcome to the Cool Sticks game. Let's see who is better\n" +
            "The rules are simple: draw 1-3 sticks, then I will draw 1-3 sticks. If you draw the last stick, you lose mate!\n"+
            "Press p to play or q to quit:";
    public static final String ERROR_MESSAGE = "Please enter the correct value";

    public Console(BufferedReader input, PrintWriter output) {
        console = output;
    }

   public void StartUp(){
        console.println(WELCOME);
   }

    public void WrongInput() {
        console.println(ERROR_MESSAGE);
    }
}
