package prog.oop.Lessons_3.FindFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

class FileFinder {

    public static ArrayList<String> findFilesInDir(String dirPath, String... extensions) {
        ArrayList<String> foundFiles = new ArrayList<>();

        try {
            File[] files = listFiles(dirPath, extensions);

            for (File file : files)
                foundFiles.add(file.getCanonicalPath());
        } catch (FileNotFoundException e) {
            System.out.println("Mentioned directory does not exist!");
        } catch (IOException e) {
            System.out.println(e);
        }

        return foundFiles;
    }

    private static File[] listFiles(String dirPath, String[] extensions) throws FileNotFoundException {
        File dir = new File(dirPath);

        if (!dir.exists())
            throw new FileNotFoundException();

        FilenameFilter filenameFilter = (File file, String fileName) -> {
            boolean acceptFile = false;

            for (String extension : extensions)
                if (fileName.endsWith(extension)) {
                    acceptFile = true;
                    break;
                }

            return acceptFile;
        };

        return dir.listFiles(filenameFilter);
    }
}