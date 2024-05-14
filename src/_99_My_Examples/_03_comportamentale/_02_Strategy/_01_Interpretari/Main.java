package _99_My_Examples._03_comportamentale._02_Strategy._01_Interpretari;

public class Main {
    public static void main(String[] args) {
        Interpretor interpretor = new Interpretor();

        Interpretare interpretare = new Average();
        interpretor.setInterpretare(interpretare);
        try {
            System.out.println(interpretor.oferaRezultat(900));
        } catch (InterpretareNotSetException e) {
            throw new RuntimeException(e);
        }

        interpretare = new Peek();
        interpretor.setInterpretare(interpretare);
        try {
            System.out.println(interpretor.oferaRezultat(5));
        } catch (InterpretareNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
