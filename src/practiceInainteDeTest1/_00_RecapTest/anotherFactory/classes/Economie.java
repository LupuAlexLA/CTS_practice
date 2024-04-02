package practiceInainteDeTest1._00_RecapTest.anotherFactory.classes;

public class Economie implements NewsArticle {
    private String title;
    private String text;
    private String link;

    Economie(String title, String text) {
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
}
