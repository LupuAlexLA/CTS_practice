package test2.structurale.facade;

public class Main {
    public static void main(String[] args) {
        MedicalDataFacade facade = new MedicalDataFacade();

        facade.recordPatientData();
        facade.updateTreatmentPlan();
        facade.fetchMedicalHistory();
    }
}
