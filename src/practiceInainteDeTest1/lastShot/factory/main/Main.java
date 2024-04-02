package practiceInainteDeTest1.lastShot.factory.main;

import practiceInainteDeTest1.lastShot.factory.classes.AbstractFactory;
import practiceInainteDeTest1.lastShot.factory.classes.NewsArticle;
import practiceInainteDeTest1.lastShot.factory.classes.NewsFactory;
import practiceInainteDeTest1.lastShot.factory.classes.NewsType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory factory = new NewsFactory();

        for(int i = 0; i < 5; i++) {
            System.out.println("ce categorie?");
            String categorie = scanner.nextLine();
            System.out.println("titlu");
            String titlu = scanner.nextLine();
            System.out.println("ce text");
            String text = scanner.nextLine();
            System.out.println("link");
            String link = scanner.nextLine();

            NewsArticle article = factory.createArticle(NewsType.valueOf(categorie), titlu, text);

            System.out.println("tv: " + categorie + " " + article.getTitle() + " " + article.getText());
            System.out.println("social media: " + categorie + " " + article.getTitle() + " " + article.getText() + " " + link);
        }
    }
}
