package _00_Test1.factory.stiri.main;

import _00_Test1.factory.stiri.classes.AbstractFactory;
import _00_Test1.factory.stiri.classes.Factory;
import _00_Test1.factory.stiri.classes.NewsArticle;
import _00_Test1.factory.stiri.classes.TipStiri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("tipul stirii");
            String tip = scanner.nextLine();
            System.out.println("titlu");
            String titlu = scanner.nextLine();
            System.out.println("text");
            String text = scanner.nextLine();
            System.out.println("introdu un link");
            String link = scanner.nextLine();


            NewsArticle stire = factory.create(TipStiri.valueOf(tip), titlu, text);
            System.out.println("stire - tv: " + i + " categorie: " + tip + " titlu: " + stire.getTitle() + " text: " + stire.getText());
            System.out.println("stire - retele socializare: " + i + " categorie: " + tip + " titlu: " + stire.getTitle() + " text: " + stire.getText() + " link: " + link);
        }
    }
}
