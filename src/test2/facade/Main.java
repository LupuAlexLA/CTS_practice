package test2.facade;

public class Main {
    public static void main(String[] args) {
        MedicalDataFacade facade = new MedicalDataFacade();

        facade.recordPatientData();
        facade.updateTreatmentPlan();
        facade.fetchMedicalHistory();
    }
}
