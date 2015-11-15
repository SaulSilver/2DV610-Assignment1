package Model;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Game {
    public Stick[] StartNewGame() {
        Stick[] sticks = new Stick[22];
        for(Stick stick : sticks)
            stick = new Stick();
        return sticks;
    }

    public boolean DrawStick(int i) {
        return false;
    }
}
