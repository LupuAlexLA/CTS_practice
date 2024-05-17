package _99_My_Examples._02_structurale._02_Proxy._03_Spital;

public class Vizitator implements ISpital {
    private boolean hasLetter;
    public static int vizitatori = 0;

    public Vizitator(boolean hasLetter) {
        this.hasLetter = hasLetter;
        vizitatori += 1;
    }

    public boolean isHasLetter() {
        return hasLetter;
    }

    public void setHasLetter(boolean hasLetter) {
        this.hasLetter = hasLetter;
    }

    @Override
    public void accesSalon(Vizitator vizitator) {
        if(vizitator.isHasLetter()) {
            System.out.println("Liber");
        } else {
            System.out.println("Interzis");
        }
    }
}
