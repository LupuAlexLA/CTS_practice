package practiceInainteDeTest1._00_Test1.factory.stiri.classes;

public class Factory implements AbstractFactory {
    @Override
    public NewsArticle create(TipStiri tip, String titlu, String text) {
        if(tip == TipStiri.ECONOMIE) {
            return new Economie(titlu, text);
        } else if (tip == TipStiri.POLITICA) {
            return new Politica(titlu, text);
        } else if (tip == TipStiri.SPORT) {
            return new Sport(titlu, text);
        } else {
            return null;
        }
    }
}
