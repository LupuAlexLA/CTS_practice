package _Test._05_composite;

public class Main {
    public static void main(String[] args) {
        Antivirus root = new Folder();

        Antivirus folder1 = new Folder();
        Antivirus folder2 = new Folder();

        Antivirus file1 = new File();
        Antivirus file2 = new File();
        Antivirus file3 = new File();

        root.addFile(file3);
        root.addFile(folder1);
        root.addFile(folder2);

        folder1.addFile(file1);
        folder2.addFile(file2);

        root.scan();

        System.out.println();

        file3.scan();

        System.out.println();

        folder1.scan();

        System.out.println();

        folder2.scan();
    }
}
