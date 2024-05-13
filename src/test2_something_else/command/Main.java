package test2_something_else.command;

public class Main {
    public static void main(String[] args) {
        Receptioner receptioner = new Receptioner();
        Mecanic mecanic = new Mecanic();

        receptioner.addServicu(new Motor(mecanic));
        receptioner.addServicu(new Turbina(mecanic));
        receptioner.addServicu(new Consumabile(mecanic));

        receptioner.sendServicii();
    }
}
