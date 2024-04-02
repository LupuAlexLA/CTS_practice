package practiceInainteDeTest1._00_Examene._01_Creationale.T04_prototype.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMovieTicket implements Ticket, Cloneable {
    private String titlu;
    private String regie;
    private List<String> actori;
    private String companie;
    private String descriere;

    @Override
    public Object clone() throws CloneNotSupportedException {
        AbstractMovieTicket copy = (AbstractMovieTicket) super.clone();
        copy.actori = new ArrayList<>();
        copy.actori.addAll(this.actori);
        copy.companie = this.companie;
        copy.descriere = this.descriere;
        copy.regie = this.regie;
        copy.titlu = this.titlu;
        return copy;
    }

    @Override
    public abstract String print();

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getRegie() {
        return regie;
    }

    public void setRegie(String regie) {
        this.regie = regie;
    }

    public List<String> getActori() {
        return actori;
    }

    public void setActori(List<String> actori) {
        this.actori = actori;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
