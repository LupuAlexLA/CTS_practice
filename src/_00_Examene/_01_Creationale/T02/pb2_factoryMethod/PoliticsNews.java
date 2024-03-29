package _00_Examene._01_Creationale.T02.pb2_factoryMethod;

public class PoliticsNews implements NewsArticle {
    private String title;
    private String text;
    private String link;

    public PoliticsNews(String title, String text) {
        this.title = title;
        this.text = text;
        this.link = null; // inițial, link-ul este null
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getLink() {
        return link;
    }

    // Metodă pentru setarea link-ului (folosită pentru postarea pe rețelele de socializare)
    public void setLink(String link) {
        this.link = link;
    }

    // Metodă pentru a limita textul la 100 de caractere
    public void truncateTextToSocialMedia() {
        if (text.length() > 100) {
            text = text.substring(0, 100);
        }
    }
}