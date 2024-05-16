package _99_My_Examples._02_structurale._05_Facade._01_Car;

public class Engine {
    private int hp;
    private double consumption;

    public Engine() {
        this.hp = 300;
        this.consumption = 7;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        System.out.println("hp: " + hp);
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
        System.out.println("consumtion: " + consumption);
    }
}
