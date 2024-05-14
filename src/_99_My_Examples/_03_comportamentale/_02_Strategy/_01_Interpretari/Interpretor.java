package _99_My_Examples._03_comportamentale._02_Strategy._01_Interpretari;

public class Interpretor {
    private Interpretare interpretare;

    public void setInterpretare(Interpretare interpretare) {
        this.interpretare = interpretare;
    }

    public String oferaRezultat(double value) throws InterpretareNotSetException {
        if(value >= 0) {
            return this.interpretare.interpreteaza(value);
        }
        else {
            throw new InterpretareNotSetException();
        }
    }
}
