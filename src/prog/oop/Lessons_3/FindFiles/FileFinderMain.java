package prog.oop.Lessons_3.FindFiles;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileFinderMain {
    public static void main(String[] args) {
        createTestFiles();

        ArrayList<String> list = FileFinder.findFilesInDir("c:\\test", ".txt", ".java", ".exe");
        printList(list);

        list = FileFinder.findFilesInDir("c:\\test", ".noMatch");
        printList(list);

        list = FileFinder.findFilesInDir("c:\\this_dir_does_not_exist", ".txt");
        printList(list);
    }

    private static void createTestFiles() {
        new File("c:\\test").mkdir();
        File[] testFiles = {new File("c:\\test\\file.txt"),
                new File("c:\\test\\file.java"),
                new File("c:\\test\\file.exe"),
                new File("c:\\test\\file.foo")};

        try {
            for (File file : testFiles)
                file.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void printList(ArrayList<String> list) {
        String delimiter = "<------------------>";

        if (list.isEmpty()) {
            System.out.printf("%s\n%s\n", "No files found", delimiter);
            return;
        }

        System.out.println("Files found:");
        for (String s : list)
            System.out.println(s);
        System.out.println(delimiter);
    }
}

