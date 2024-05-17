package _99_My_Examples._02_structurale._03_Composite._03_Virus;

import java.util.ArrayList;
import java.util.List;

public class Continent extends AVirus implements IVirus {
    private List<IVirus> tari = new ArrayList<>();
    @Override
    void addTara(IVirus virus) {
        tari.add(virus);
    }

    @Override
    void deleteTara(IVirus virus) {
        tari.remove(virus);
    }

    @Override
    List<IVirus> getAllTari() {
        return tari;
    }

    @Override
    public float getRataMortalitate() {
        float sum = 0;
        for(IVirus virus : tari) {
            sum += virus.getRataMortalitate();
        }
        return sum;
    }

    @Override
    public String getDenumire() {
        String culturi = null;
        for (IVirus virus : tari) {
            culturi += virus.getDenumire() + " ";
        }
        return culturi;
    }
}
