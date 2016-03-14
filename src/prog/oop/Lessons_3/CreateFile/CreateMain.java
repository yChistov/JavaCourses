package prog.oop.Lessons_3.CreateFile;

/*      Написать программу, которая создаст текстовый файл и запишет в него
        список файлов (путь, имя, дата создания) из заданного каталога*/

import java.io.File;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CreateMain {
    public static void main(String[] args) throws Exception {

        File file = new File("D:\\dir\\files\\", "list.txt");

        ArrayList<String> list = new ArrayList<>();

        findFiles("D:\\dir\\", list);

        writeToFile(file.getCanonicalPath(), list);
    }

    // Находим все файлы в указанном каталоге
    public static void findFiles(String dirSrc, ArrayList<String> list) throws Exception {

        File dir = new File(dirSrc);
        File[] files = dir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        for (File file : files) {
            // Проверяем, ячейка массива файлов не пустая и она является файлом
            if (file != null && file.isFile()) {
                // Добавляем в список путь, имена и дату изменения всех файлов из данного каталога
                list.add(dirSrc + file.getName() + "   " + sdf.format(new Date(file.lastModified())));
            }
        }
    }

    // Записываем в файл список файлов из указанного каталога
    public static void writeToFile(String pathFile, ArrayList<String> list) throws Exception{

        try (RandomAccessFile in = new RandomAccessFile(pathFile, "rw")) {
            for (String s : list) {
                in.writeBytes(s + "\n");
                System.out.println(s);
            }
        }
    }
}

