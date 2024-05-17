package _99_My_Examples._02_structurale._01_Adapter._03_OnlineBooking;

public class CinemaToOnlineBooking extends CinemaTicket implements OnlineBooking {
    @Override
    public String showOrderDetails() {
        return super.showDetails("Spiderman", 180);
    }
}
