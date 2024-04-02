package practiceInainteDeTest1._00_RecapTest.anotherFactory.classes;

public class SportFactory implements AbstractFactory {
    @Override
    public NewsArticle createNews(String type, String text, String title) {
        return new Sport(title, text);
    }
}
