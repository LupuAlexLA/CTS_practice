package test2_something_else.command;

import java.util.ArrayList;
import java.util.List;

public class Receptioner {
    private List<ServicuMecanic> servicii = new ArrayList<>();

    public void addServicu(ServicuMecanic servicuMecanic) {
        servicii.add(servicuMecanic);
    }

    public void sendServicii() {
        for (ServicuMecanic s : servicii) {
            s.repara();
        }
        servicii.clear();
    }
}
