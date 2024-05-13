package test2_something_else.command;

public class Motor implements ServicuMecanic {
    private Mecanic mecanic;

    public Motor(Mecanic mecanic) {
        this.mecanic = mecanic;
    }

    @Override
    public void repara() {
        mecanic.reparaMotor();
    }
}
