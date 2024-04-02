package practiceInainteDeTest1._00_Examene._01_Creationale.T04_prototype.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Introduceti numarul de bilete dorite: ");
        int nrBilete = scanner.nextInt();
        scanner.nextLine();

        AbstractMovieTicket baseMovieTicket = new MovieTicket(new Date(), "21A");
        List<String> actori = new ArrayList<>();
        actori.add("Actor 1");
        actori.add("Actor 2");
        baseMovieTicket.setActori(actori);
        baseMovieTicket.setCompanie("IntactAcademy");
        baseMovieTicket.setDescriere("A boring movie");
        baseMovieTicket.setRegie("Amza Pelea");
        baseMovieTicket.setTitlu("Furtuna pe Bosfor");

        for (int i = 0; i < nrBilete; i++) {
            System.out.print("Data: ");
            String data = scanner.nextLine();
            System.out.print("Loc: ");
            String loc = scanner.nextLine();
            try {
                MovieTicket ticket = (MovieTicket) baseMovieTicket.clone();
                Date date = new SimpleDateFormat("dd.MM.yyyy").parse(data);
                ticket.setData(date);
                ticket.setLocOcupat(loc);
                tickets.add(ticket);
                ticket.print();
            } catch (CloneNotSupportedException | ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
