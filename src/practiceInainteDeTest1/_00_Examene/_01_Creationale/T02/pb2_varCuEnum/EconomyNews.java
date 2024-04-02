package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_varCuEnum;

public class EconomyNews implements NewsArticle {
    private String title;
    private String text;
    private String link;

    public EconomyNews(String title, String text) {
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

    public void truncateTextToSocialMedia() {
        if (text.length() > 100) {
            text = text.substring(0, 100);
        }
    }
}