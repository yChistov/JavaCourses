package prog.oop.Lessons_3.BufferedReader;

/*      Написать программу для копирования всех файлов из одного каталога в
        другой*/

import java.io.*;
import java.util.ArrayList;

public class FileCopy {

    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        String dirSrc = "D:\\dir\\", dirDest = "D:\\dir\\files\\";

        finedFiles(dirSrc, list);

        // Проходим по списку имен файлов, создаем файлы с такими же именами в нужном каталоге, копируем содержимое в одноименных файлах
        for (String s : list) {
            File file = new File(dirDest, s);   // Создаем пустые файлы в каталоге назначения и с именами по списку файлов-источников
            String fileSrc = dirSrc + s;        // Полный путь файла-источника
            String fileDest = dirDest + s;      // Полный путь файла назначения
            copyFiles(fileSrc, fileDest);
        }
    }

    // Находим все файлы в указанном каталоге
    public static void finedFiles(String dirSrc, ArrayList<String> list) throws Exception {

        File dir = new File(dirSrc);

        System.out.println("----------------------------------");
        System.out.println("List of files:");

        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i] != null && files[i].isFile()) {    // Проверяем, ячейка массива файлов не пустая и она является файлом
                list.add(files[i].getName());               // Добавляем в список имена всех файлов из данного каталога
                System.out.println((files[i].isFile() ? "File: " : "Directory: ") + files[i].getPath());
            }
        }
        System.out.println("----------------------------------");
    }

    // Копируем содержимое файла из файла-источника в файл назначения
    public static void copyFiles(String fileSrc, String fileDest) throws Exception {

        System.out.println("Copy file: " + fileSrc + "...  into: " + fileDest + ".");

        FileInputStream in = new FileInputStream(fileSrc);
        try {
            FileOutputStream out = new FileOutputStream(fileDest);
            try {
                byte[] buf = new byte[1024];
                int r;

                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) {
                        out.write(buf, 0, r);
                    }
                } while (r > 0);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}