package _Test2._05_composite;

import java.util.List;

public class File extends Antivirus {
    @Override
    public void addFile(Scannable file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFile(Scannable file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Scannable> getAllFiles() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        System.out.println("File was scanned!");
    }
}
