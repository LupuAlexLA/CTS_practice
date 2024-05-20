package _Test2._05_composite;

public class Main {
    public static void main(String[] args) {
        Antivirus root = new Folder();

        Antivirus folder1 = new Folder();
        Antivirus folder2 = new Folder();

        Antivirus file1 = new File();
        Antivirus file2 = new File();

        Antivirus file3 = new File();

        root.addFile(folder1);
        root.addFile(folder2);
        root.addFile(file3);

        folder1.addFile(file1);
        folder2.addFile(file2);

        file3.scan();

        System.out.println();

        folder1.scan();

        System.out.println();

        root.scan();
    }
}
