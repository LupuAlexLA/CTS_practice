package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_recap;

public class PoliticsNews implements NewsArticle {
    private String title;
    private String text;
    private String link;
    private NewsType type;

    public PoliticsNews(NewsType type, String title, String text) {
        this.type = type;
        this.title = title;
        this.text = text;
        this.link = null;
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

    public void setLink(String link) {
        this.link = link;
    }

    public NewsType getType() {
        return type;
    }
}
