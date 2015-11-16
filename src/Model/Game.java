package Model;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Game {
    private Stick[] sticks;
    private int counter;

    public Stick[] StartNewGame() {
        counter = 1;
        sticks = new Stick[22];

        for(int i = 0; i<sticks.length; i++) {
            Stick a_stick = new Stick();
            sticks[i] = a_stick;
        }
        return sticks;
    }

    public boolean DrawStick(int sticksNumber) {
        if(sticksNumber <= 3 && sticksNumber > 0){
            for(int i = 0; i<sticksNumber; i++) {
                Stick drawnStick = new Stick();
                drawnStick.setStick('_');
                sticks[sticks.length - counter] = drawnStick;
                counter++;
            }
            return true;
        }
        else{ return false;}
    }
}
