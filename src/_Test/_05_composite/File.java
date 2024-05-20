package _Test._05_composite;

import java.util.List;

public class File extends Antivirus {
    @Override
    public void addFile(Scannable scannable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteFile(Scannable scannable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Scannable> getAllFiles() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        System.out.println("The file was scanned!");
    }
}
