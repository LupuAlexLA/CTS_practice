package _99_My_Examples._02_structurale._06_Flyweight;

public class MedicalAdvice implements IReteta {
    private int cnp;
    private String hydrating;
    private int sleepHours;

    public MedicalAdvice(int cnp, String hydrating, int sleepHours) {
        this.cnp = cnp;
        this.hydrating = hydrating;
        this.sleepHours = sleepHours;
    }

    @Override
    public void display(Disease disease) {
        System.out.println("Pacientul cu CNP: " + cnp + " sufera de " + disease.getDiseaseName() +
                ", alte recomandari: " + hydrating + "; " + sleepHours);
    }
}
