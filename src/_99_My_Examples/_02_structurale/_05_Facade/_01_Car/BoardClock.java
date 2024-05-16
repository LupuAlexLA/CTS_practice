package _99_My_Examples._02_structurale._05_Facade._01_Car;

public class BoardClock {
    private String colour;

    public BoardClock() {
        this.colour = "basic";
    }

    public void turnOnSport() {
        this.colour = "red";
        System.out.println("boardclock : red");
    }

    public void turnOnOffRoad() {
        this.colour = "green";
        System.out.println("boardclock : green");
    }
}
