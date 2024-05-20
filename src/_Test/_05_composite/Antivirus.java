package _Test._05_composite;

import java.util.List;

public abstract class Antivirus implements Scannable {
    public abstract void addFile(Scannable scannable);
    public abstract void deleteFile(Scannable scannable);
    public abstract List<Scannable> getAllFiles();
}
