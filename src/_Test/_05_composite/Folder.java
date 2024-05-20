package _Test._05_composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Antivirus {
    private List<Scannable> subfolders = new ArrayList<>();
    @Override
    public void addFile(Scannable scannable) {
        subfolders.add(scannable);
    }

    @Override
    public void deleteFile(Scannable scannable) {
        subfolders.remove(scannable);
    }

    @Override
    public List<Scannable> getAllFiles() {
        return subfolders;
    }

    @Override
    public void scan() {
        for(Scannable file : subfolders) {
            file.scan();
        }
    }
}
