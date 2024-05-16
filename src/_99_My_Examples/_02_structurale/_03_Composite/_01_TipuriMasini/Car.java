package _99_My_Examples._02_structurale._03_Composite._01_TipuriMasini;

import java.util.List;

public class Car implements ISpecifications {
    private String name;
    private int hp;
    private int luxury;

    public Car(String name, int hp, int luxury) {
        this.name = name;
        this.hp = hp;
        this.luxury = luxury;
    }

    @Override
    public void receiveSpecifications(String name, int hp, int luxury) {
        System.out.println(name + " hp: " + hp + " luxury calificative: " + luxury);
    }

    @Override
    public void insert(ISpecifications specifications) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(ISpecifications specifications) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ISpecifications> getAllSpecifications() {
        throw new UnsupportedOperationException();
    }
}
