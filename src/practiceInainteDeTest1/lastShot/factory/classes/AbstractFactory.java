package practiceInainteDeTest1.lastShot.factory.classes;

public interface AbstractFactory {
    NewsArticle createArticle(NewsType type, String title, String text);
}
