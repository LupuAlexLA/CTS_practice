package _99_My_Examples._02_structurale._06_Flyweight;

public class Main {
    public static void main(String[] args) {
        CustomPatientFactory factory = new CustomPatientFactory();

        IReteta firstReteta = factory.getCustomPatient(123);
        IReteta secondReteta = factory.getCustomPatient(456);
        IReteta thirdReteta = factory.getCustomPatient(123);

        firstReteta.display(new Disease("diabet"));
        secondReteta.display(new Disease("ciroza"));
        thirdReteta.display(new Disease("diabet"));
    }
}
