package _03_Factory_Method.seminar;

public class ExcelDocument implements OfficeDocument {
    private String name;

    ExcelDocument() {}

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
        System.out.println("Excel is opening...");
    }
}
