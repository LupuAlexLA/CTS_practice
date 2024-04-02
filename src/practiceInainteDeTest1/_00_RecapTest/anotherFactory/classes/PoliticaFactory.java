package practiceInainteDeTest1._00_RecapTest.anotherFactory.classes;

public class PoliticaFactory implements AbstractFactory {
    @Override
    public NewsArticle createNews(String type, String text, String title) {
        return new Politica(title, text);
    }
}
