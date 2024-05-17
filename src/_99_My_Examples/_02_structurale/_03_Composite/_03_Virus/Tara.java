package _99_My_Examples._02_structurale._03_Composite._03_Virus;

import java.util.List;

public class Tara extends AVirus implements IVirus {
    private float rataMortalitate;
    private String denumire;

    public Tara(float rataMortalitate, String denumire) {
        this.rataMortalitate = rataMortalitate;
        this.denumire = denumire;
    }

    @Override
    void addTara(IVirus virus) {
        throw new UnsupportedOperationException();
    }

    @Override
    void deleteTara(IVirus virus) {
        throw new UnsupportedOperationException();
    }

    @Override
    List<IVirus> getAllTari() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float getRataMortalitate() {
        return this.rataMortalitate;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
