package View;

import Model.Game;
import Model.Stick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * Created by Hatem on 11/16/2015.
 */
public class Console {
    private PrintWriter console;
    private BufferedReader input;

    public static final String WELCOME = "Wanna play a game?\nWelcome to the Cool Sticks game. Let's see who is better\n" +
            "The rules are simple: draw 1-3 sticks, then I will draw 1-3 sticks. If you draw the last stick, you lose mate!\n"+
            "Press p to play or q to quit:";
    public static final String ERROR_MESSAGE = "Please enter the correct value";
    public static final String COMPUTER_CHOICE1 = "Computer drew ";
    public static final String COMPUTER_CHOICE2 = " sticks.";
    public static final String END_GAME = "Well \\_(._.)_/";
    public static final String LOSE_MESSAGE = "You lose, you owe me 100 SEK now!";

    public Console(BufferedReader input, PrintWriter output) {
        console = output;
        this.input = input;
    }

   public void StartUp(){
        console.println(WELCOME);
   }

    public void WrongInput() {
        console.println(ERROR_MESSAGE);
    }

    public void ShowSticks(Game game)
    {
        StringBuilder sb = new StringBuilder();
        for (Stick stick : game.getSticks()) {
            sb.append(stick.toString());
        }
        console.println(sb.toString());
    }

    public char GetStartUpInput() throws IOException {
        return input.readLine().charAt(0);
    }

    public int CheckInput(char input) {
        if (input == 'p') { return 1; }
        else if (input == 'q') { return 2;}
        else {
            WrongInput();
            return 0;
        }
    }

    public int GetPlayerChoice() throws IOException {
        console.println("Enter the number:");
        int userChoice = Integer.parseInt(input.readLine());
        return userChoice;
    }

    public void GetComputerChoice(int computerChoice) { console.println(COMPUTER_CHOICE1 + computerChoice + COMPUTER_CHOICE2); }

    public void EndGame() { console.println(END_GAME);}

    public void UserLose() {
        console.println(LOSE_MESSAGE);
    }
}
