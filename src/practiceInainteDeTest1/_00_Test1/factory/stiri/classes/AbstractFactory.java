package practiceInainteDeTest1._00_Test1.factory.stiri.classes;

public interface AbstractFactory {
    NewsArticle create(TipStiri tip, String text, String titlu);
}
