package test2.strategy;

public class Switcher {
    private Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public int changeHp() throws ModeNotSetException {
        if(this.mode != null) {
            return this.mode.changeHp();
        }
        else {
            throw new ModeNotSetException();
        }
    }
}
