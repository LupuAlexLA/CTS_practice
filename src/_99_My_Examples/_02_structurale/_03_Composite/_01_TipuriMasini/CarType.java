package _99_My_Examples._02_structurale._03_Composite._01_TipuriMasini;

import java.util.ArrayList;
import java.util.List;

public class CarType implements ISpecifications {
    private List<ISpecifications> specificationsArray = new ArrayList<>();

    @Override
    public void receiveSpecifications(String name, int hp, int luxury) {
        for(ISpecifications specifications : specificationsArray) {
            specifications.receiveSpecifications(name, hp, luxury);
        }
    }

    @Override
    public void insert(ISpecifications specifications) {
        specificationsArray.add(specifications);
    }

    @Override
    public void delete(ISpecifications specifications) {
        specificationsArray.remove(specifications);
    }

    @Override
    public List<ISpecifications> getAllSpecifications() {
        return specificationsArray;
    }
}
