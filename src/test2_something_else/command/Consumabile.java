package test2_something_else.command;

public class Consumabile implements ServicuMecanic {
    private Mecanic mecanic;

    public Consumabile(Mecanic mecanic) {
        this.mecanic = mecanic;
    }

    @Override
    public void repara() {
        mecanic.schimbaConsumabile();
    }
}
