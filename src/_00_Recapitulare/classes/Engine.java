package _00_Recapitulare.classes;

public class Engine {
    private float power;
    private EngineType engineType = EngineType.BLG;

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
