package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_varCuEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractNewsFactory factory = new NewsFactory();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Introduceti tipul de stire!");
            String categorie = scanner.nextLine();
            System.out.println("Introduceți titlul știrii:");
            String title = scanner.nextLine();
            System.out.println("Introduceți textul știrii:");
            String text = scanner.nextLine();
            System.out.println("Introduceți link-ul știrii:");
            String link = scanner.nextLine();

            NewsArticle article = factory.createNews(NewsType.valueOf(categorie), title, text);

            System.out.println("Stirea de tip " +  "Postare pe site: " + article.getTitle() + " - " + article.getText());

            System.out.println("Postare pe rețele de socializare: " + article.getTitle() + " - " + article.getText() + " Mai multe detalii: " + link);
        }
    }
}
