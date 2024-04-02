package practiceInainteDeTest1._00_Examene._01_Creationale.T04_prototype.classes;

import java.util.Date;

public class MovieTicket extends AbstractMovieTicket {
    private Date data;
    private String locOcupat;

    public MovieTicket(Date data, String locOcupat) {
        System.out.println("Se genereaza primul bilet");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.data = data;
        this.locOcupat = locOcupat;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MovieTicket copy = (MovieTicket) super.clone();
        copy.data = new Date(this.data.getTime());
        copy.locOcupat = this.locOcupat;
        return copy;
    }

    @Override
    public String print() {
        String result = "Movie title" + getTitlu() + ", Date: " + getData() + ", Loc: " + getLocOcupat();
        System.out.println(result);
        return result;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocOcupat() {
        return locOcupat;
    }

    public void setLocOcupat(String locOcupat) {
        this.locOcupat = locOcupat;
    }
}
