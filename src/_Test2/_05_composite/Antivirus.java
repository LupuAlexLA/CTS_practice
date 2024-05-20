package _Test2._05_composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Antivirus implements Scannable {
    public abstract void addFile(Scannable file);
    public abstract void removeFile(Scannable file);
    public abstract List<Scannable> getAllFiles();
}
