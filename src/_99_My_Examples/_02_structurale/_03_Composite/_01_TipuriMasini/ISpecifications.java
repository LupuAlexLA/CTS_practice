package _99_My_Examples._02_structurale._03_Composite._01_TipuriMasini;

import java.util.List;

public interface ISpecifications {
    void receiveSpecifications(String name, int hp, int luxury);
    void insert(ISpecifications specifications);
    void delete(ISpecifications specifications);
    List<ISpecifications> getAllSpecifications();
}
