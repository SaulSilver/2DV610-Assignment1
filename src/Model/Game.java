package Model;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Game {
    public char[] StartNewGame() {
        char[] sticks = new char[22];
        for(int i = 0; i < sticks.length; i++)
            sticks[i] = 'I';
        return sticks;
    }
}
