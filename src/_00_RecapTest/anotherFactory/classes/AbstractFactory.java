package _00_RecapTest.anotherFactory.classes;

public interface AbstractFactory {
    NewsArticle createNews(String type, String text, String title);
}
