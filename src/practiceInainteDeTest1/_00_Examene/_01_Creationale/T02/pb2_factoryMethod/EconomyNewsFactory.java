package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_factoryMethod;

public class EconomyNewsFactory implements AbstractNewsFactory {
    @Override
    public NewsArticle createNewsArticle(String title, String text) {
        return new EconomyNews(title, text);
    }
}