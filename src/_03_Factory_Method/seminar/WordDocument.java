package _03_Factory_Method.seminar;

public class WordDocument implements OfficeDocument {
    private String name;

    WordDocument() { }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Word is opening...");
    }
}
