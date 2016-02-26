package prog.oop.Lessons_3.FindFiles;

/*      Модифицировать проект FindFiles так, чтобы программа искала в каталоге
        все файлы с расширениями из списка*/

/*      Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов, имя которых
        длиннее 5 символов и вторая буква равна ‘A’.*/


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static class MyFileFilter implements FilenameFilter {
        private String[] exts;

        public MyFileFilter(String[] exts) {
            this.exts = exts;
        }

        public boolean accept(File dir, String name) {
            for (String ext : exts) {
                if (name.endsWith(ext))
                    return true;
            }
            return false;
        }
    }

    private static void findFiles(String srcPath, String[] exts, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(exts));

        for (int i = 0; i < files.length; i++) {
            list.add(srcPath + files[i].getName());
            if (files[i].getName().charAt(1) == 'A' && files[i].getName().length() > 5){
                System.out.println((files[i].isFile() ? "File: " : "Directory: ") + files[i].getPath());
            }
            if (files[i].isDirectory()){
                findFiles(files[i].getPath(), exts, list);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] exts = {".txt", ".doc", ".exe", ".java"};

        try {
            findFiles("d:\\", exts, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}