package practiceInainteDeTest1._00_RecapTest.anotherFactory.main;

import practiceInainteDeTest1._00_RecapTest.anotherFactory.classes.AbstractFactory;
import practiceInainteDeTest1._00_RecapTest.anotherFactory.classes.NewsArticle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cate factory?");
        int noOfFactory = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < noOfFactory; i++) {
            System.out.println("Ce tip?");
            String tip = scanner.nextLine();
            System.out.println("title");
            String title = scanner.nextLine();
            System.out.println("text");
            String text = scanner.nextLine();

            NewsArticle article = factory.createNews(tip, title, text);

        }
    }
}
