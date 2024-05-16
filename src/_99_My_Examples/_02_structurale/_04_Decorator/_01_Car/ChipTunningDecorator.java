package _99_My_Examples._02_structurale._04_Decorator._01_Car;

public class ChipTunningDecorator extends CarDecorator {
    private int surplusHp;

    public ChipTunningDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    public int getSurplusHp() {
        return surplusHp;
    }

    public void setSurplusHp(int surplusHp) {
        this.surplusHp = surplusHp;
    }

}
