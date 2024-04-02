package pTest1.factoryMethod.classes;

public abstract class Sport {
    protected String homeTeam;
    protected String awayTeam;

    public Sport(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
}
