package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_recap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractNewsFactory factory = new NewsFactory();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Categoria de stiri:");
            String categorie = scanner.nextLine();
            System.out.println("Titlu:");
            String titlu = scanner.nextLine();
            System.out.println("Text:");
            String text = scanner.nextLine();

            NewsArticle article = factory.createNews(NewsType.valueOf(categorie), titlu, text);
            System.out.println("categorie" + categorie + "titlu: " + article.getText() + ", text: " + article.getText());
        }

    }
}
