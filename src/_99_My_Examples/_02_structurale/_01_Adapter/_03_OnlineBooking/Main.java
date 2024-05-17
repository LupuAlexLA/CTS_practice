package _99_My_Examples._02_structurale._01_Adapter._03_OnlineBooking;

public class Main {
    public static void main(String[] args) {
        OnlineBooking online = new OnlineTicket();
        System.out.println(online.showOrderDetails());

        CinemaBooking cinema = new CinemaTicket();
        System.out.println(cinema.showDetails("Spiderman", 120));

        cinema = new CinemaToOnlineBooking();
        System.out.println(cinema.showDetails("Batman", 150));
    }
}
