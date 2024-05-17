package _99_My_Examples._02_structurale._01_Adapter._03_OnlineBooking;

public class CinemaTicket implements CinemaBooking {
    private String title;
    private int duration;

    @Override
    public String showDetails(String title, int duration) {
        return "Movie " + title + " has " + duration + " minutes";
    }
}
