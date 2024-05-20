package _Test2._05_composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Antivirus {
    private List<Scannable> files = new ArrayList<>();
    @Override
    public void addFile(Scannable file) {
        files.add(file);
    }

    @Override
    public void removeFile(Scannable file) {
        files.remove(file);
    }

    @Override
    public List<Scannable> getAllFiles() {
        return files;
    }

    @Override
    public void scan() {
        for(Scannable file : files) {
            file.scan();
        }
    }
}
