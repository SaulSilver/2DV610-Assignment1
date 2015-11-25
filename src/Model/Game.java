package Model;

import java.util.Random;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Game {
    private Stick[] sticks;
    private int counter;
    private final int MAX_STICKS_NUMBER = 21;
    private final int MAX_CHOICE = 3;
    private final int MIN_CHOICE = 1;


    public void StartNewGame() {
        counter = 1;
        sticks = new Stick[MAX_STICKS_NUMBER + 1];

        for(int i = 0; i<sticks.length; i++) {
            Stick a_stick = new Stick();
            sticks[i] = a_stick;
        }
    }

    public boolean DrawStick(int sticksNumber) {
        if(sticksNumber <= MAX_CHOICE && sticksNumber >= MIN_CHOICE){
            DrawingSticks(sticksNumber);
            return true;
        }
        else{ return false;}
    }

    public int ComputerDrawStick() {
        int sticksNumber;

        if(counter >= 18) {
            sticksNumber = 1;
        }
        else {
            Random rand = new Random();
            sticksNumber = rand.nextInt(3) + 1;
        }
        DrawingSticks(sticksNumber);
        return sticksNumber;
    }

    private void DrawingSticks(int sticksNumber)
    {
        for(int i = 0; i<sticksNumber; i++)
        {
            Stick drawnStick = new Stick();
            drawnStick.setStick('_');
            sticks[sticks.length - counter] = drawnStick;
            counter++;
        }
    }

    public boolean OneStickLeft() {
        int counter = 0;

        for(Stick s : sticks){
            if (s.toString().equals("I"))
                counter++;
        }
        return counter == 1;
    }

    public Stick[] getSticks() {
        return sticks;
    }

    public boolean CheckSticks() {
        if (counter >= MAX_STICKS_NUMBER) return false;
        else return true;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
