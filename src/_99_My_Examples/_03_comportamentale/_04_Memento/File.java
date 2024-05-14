package _99_My_Examples._03_comportamentale._04_Memento;

public class File implements Cloneable {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void appendCode(String code) {
        this.code = this.code + code;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        File copy = (File) super.clone();
        copy.code = code;
        return copy;
    }
}
