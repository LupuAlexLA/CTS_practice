package _99_My_Examples._03_comportamentale._02_Strategy;

public class Average implements Interpretare {
    @Override
    public String interpreteaza(double value) {
        if(value > 0 && value <= 3000) {
            return "Fara griji!";
        }
        else if(value > 3000 && value < 5000) {
            return "Radiatii mari!";
        } else if(value >= 5000) {
            return "Pericol!";
        }
        else {
            return null;
        }
    }
}
