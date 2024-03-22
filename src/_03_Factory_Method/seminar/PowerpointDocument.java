package _03_Factory_Method.seminar;

public class PowerpointDocument implements OfficeDocument {
    private String name;

    PowerpointDocument() {}

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
        System.out.println("Powerpoint is opening...");
    }
}
