package Model;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Stick {
    private char stick;

    public Stick() {
        stick = 'I';
    }

    public Character getStick() {
        return stick;
    }

    public void setStick(char stick) {
        this.stick = stick;
    }

    @Override
    public String toString()
    {
        return String.valueOf(getStick());
    }
}
