package test2_something_else.command;

public class Turbina implements ServicuMecanic {
    private Mecanic mecanic;

    public Turbina(Mecanic mecanic) {
        this.mecanic = mecanic;
    }

    @Override
    public void repara() {
        mecanic.reparaTurbina();
    }
}
