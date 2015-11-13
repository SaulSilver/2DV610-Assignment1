package Model;

/**
 * Created by Hatem on 11/12/2015.
 */
public class Stick {
    char stick;

    public Stick() {
        stick = 'I';
    }

    public Character getStick() {
        return stick;
    }

    @Override
    public String toString()
    {
        return String.valueOf(getStick());
    }
}
