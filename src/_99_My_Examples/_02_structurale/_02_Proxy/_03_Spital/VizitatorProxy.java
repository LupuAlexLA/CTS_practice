package _99_My_Examples._02_structurale._02_Proxy._03_Spital;

import java.util.ArrayList;
import java.util.List;

public class VizitatorProxy implements ISpital {
    private ISpital spital;
    private List<Vizitator> vizitatori = new ArrayList<>();

    public VizitatorProxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void accesSalon(Vizitator vizitator) {
        if(Vizitator.vizitatori < 5 && vizitator.isHasLetter() == true) {
            System.out.println("Vizitatorii sunt lasati sa treaca");
        }
        else if (Vizitator.vizitatori >= 5 && vizitator.isHasLetter() == true) {
            System.out.println("Vizitatorii sunt lasati sa treaca doar cu combinezoane");
        } else if (Vizitator.vizitatori > 5 && vizitator.isHasLetter() == false){
            System.out.println("Vizitatorilor le este interzis");
        }
    }
}
