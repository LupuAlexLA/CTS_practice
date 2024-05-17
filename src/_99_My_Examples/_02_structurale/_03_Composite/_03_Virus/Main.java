package _99_My_Examples._02_structurale._03_Composite._03_Virus;

public class Main {
    public static void main(String[] args) {
        IVirus europa = new Continent();

        IVirus romanaia = new Tara(20.5f, "v4");
        IVirus italia = new Tara(23.5f, "v4");
        IVirus germania = new Tara(50.5f, "v4");


    }
}
