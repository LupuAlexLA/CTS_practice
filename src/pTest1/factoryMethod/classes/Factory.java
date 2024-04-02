package pTest1.factoryMethod.classes;

public class Factory implements AbstractFactory {
    @Override
    public Sport createSport(SportType type, String homeTeam, String awayTeam) {
        if(type == SportType.FOTBAL) {
            return new Fotbal(homeTeam, awayTeam);
        } else if (type == SportType.BASCHET) {
            return new Baschet(homeTeam, awayTeam);
        } else if (type == SportType.HANDBAL) {
            return new Handbal(homeTeam, awayTeam);
        } else {
            return null;
        }
    }
}
