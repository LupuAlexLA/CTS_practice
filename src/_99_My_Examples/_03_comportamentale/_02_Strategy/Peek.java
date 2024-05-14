package _99_My_Examples._03_comportamentale._02_Strategy;

public class Peek implements Interpretare {
    @Override
    public String interpreteaza(double value) {
        if(value > 0 && value <= 3) {
            return "Fara griji!";
        }
        else if(value > 3 && value < 6) {
            return "Radiatii mari!";
        } else if(value >= 6) {
            return "Pericol!";
        }
        else {
            return null;
        }
    }
}
