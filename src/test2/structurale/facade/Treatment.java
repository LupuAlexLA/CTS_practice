package test2.structurale.facade;

import java.util.ArrayList;
import java.util.List;

public class Treatment {
    public List<String> treatments = new ArrayList<>();

    public List<String> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<String> treatments) {
        this.treatments = treatments;
    }

    public void addPills(String pill) {
        treatments.add(pill);
    }
}
