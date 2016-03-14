package prog.oop.Lessons_3.SequenceInputStream;

/*      Написать программу, которая скопирует несколько файлов в один.
        Подумать как для этого использовать java.io.SequenceInputStream*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class CopyWithSequenceInputStream {
    public static void main(String[] args) throws IOException {

        // "Инициирование" исходных потоков
        FileInputStream fis1 = new FileInputStream("d:\\Tmp\\ForSequenceInputStreamTest\\file1.txt");
        FileInputStream fis2 = new FileInputStream("d:\\Tmp\\ForSequenceInputStreamTest\\file2.txt");
        FileInputStream fis3 = new FileInputStream("d:\\Tmp\\ForSequenceInputStreamTest\\file3.txt");

        // Инициирование выходного потока
        FileOutputStream fis4 = new FileOutputStream("d:\\Tmp\\ForSequenceInputStreamTest\\file4.txt");

        // Создаем последовательность объектов для дальнейшего "объединения"
        ArrayList<InputStream> inputStreams = new ArrayList<>();
        inputStreams.add(fis1);
        inputStreams.add(fis2);
        inputStreams.add(fis3);

        // Готовим для передачи в SequenceInputStream все элементы вектора inputStreams
        // через интерфейс Enumeration
        Enumeration<InputStream> enu = Collections.enumeration(inputStreams);

        // Инициация для слияния экземпляров класса InputStream из вектора enu
        SequenceInputStream sis = new SequenceInputStream(enu);

        byte[] buffer = new byte[1024];
        int byteRead = 0;

        try {
        for (; (byteRead = sis.read(buffer)) > 0;) {
            fis4.write(buffer, 0, byteRead);
        }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
