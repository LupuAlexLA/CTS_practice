package _99_My_Examples._02_structurale._03_Composite._01_TipuriMasini;

public class Main {
    public static void main(String[] args) {
        ISpecifications audiBrand = new CarType();

        ISpecifications sportCars = new CarType();
        ISpecifications suvCars = new CarType();

        ISpecifications car1 = new Car("audi tt", 500, 4);
        ISpecifications car2 = new Car("audi rs7", 700, 8);

        ISpecifications car3 = new Car("audi rsq8", 800, 10);

        audiBrand.insert(sportCars);
        audiBrand.insert(suvCars);

        sportCars.insert(car1);
        sportCars.insert(car2);

        suvCars.insert(car3);

        audiBrand.receiveSpecifications("audi s", 100, 10);
    }
}
