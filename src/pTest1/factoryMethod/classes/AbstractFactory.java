package pTest1.factoryMethod.classes;

public interface AbstractFactory {
    Sport createSport(SportType type, String homeTeam, String awayTeam);
}
