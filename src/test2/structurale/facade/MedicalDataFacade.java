package test2.structurale.facade;

public class MedicalDataFacade {
    Pacient pacient = new Pacient();
    Treatment treatment = new Treatment();
    History history = new History();

    public void recordPatientData() {
        pacient.setDisease("diabet");
        pacient.setAge(30);
        System.out.println("The pacient has " + pacient.getDisease() + " age: " + pacient.getAge());
    }

    public void updateTreatmentPlan() {
        treatment.addPills("insulina");
    }

    public void fetchMedicalHistory() {
        treatment.getTreatments();
        history.setLastVisit();
        history.getLastVisit();
    }
}
