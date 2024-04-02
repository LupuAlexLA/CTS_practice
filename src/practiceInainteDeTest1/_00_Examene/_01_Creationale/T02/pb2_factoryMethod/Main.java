package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_factoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractNewsFactory factory = null;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceți categoria știrii (economie, politică, sport):");
            String category = scanner.nextLine();
            System.out.println("Introduceți titlul știrii:");
            String title = scanner.nextLine();
            System.out.println("Introduceți textul știrii:");
            String text = scanner.nextLine();
            System.out.println("Introduceți link-ul știrii:");
            String link = scanner.nextLine();

            // Alegerea factory-ului pe baza categoriei
            switch (category.toLowerCase()) {
                case "economie":
                    factory = new EconomyNewsFactory();
                    break;
                case "politică":
                    factory = new PoliticsNewsFactory();
                    break;
                case "sport":
                    factory = new SportsNewsFactory();
                    break;
                default:
                    System.out.println("Categorie invalidă. Încercați din nou.");
                    continue;
            }

            // Crearea știrii
            NewsArticle article = factory.createNewsArticle(title, text);

            // Postarea pe site
            postOnWebsite(article);

            // Postarea pe rețele de socializare
            postOnSocialMedia(article, link);
        }
    }

    private static void postOnWebsite(NewsArticle article) {
        System.out.println("Postare pe site: " + article.getTitle() + " - " + article.getText());
    }

    private static void postOnSocialMedia(NewsArticle article, String link) {
        String socialMediaText = article.getText().length() > 100 ? article.getText().substring(0, 100) : article.getText();
        System.out.println("Postare pe rețele de socializare: " + article.getTitle() + " - " + socialMediaText + " Mai multe detalii: " + link);
    }
}