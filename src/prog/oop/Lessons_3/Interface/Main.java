package prog.oop.Lessons_3.Interface;

/*      Написать код для мониторинга каталога. Выводить на экран
        предупреждение если в каталог добавляется текстовый
        файл (*.txt).*/

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] list = {"D:\\1.txt", "D:\\2.txt", "D:\\3.txt"};
        Monitor m = new Monitor(list, new FileEvent());
        m.start();

        File f = new File("D:\\");
        MonitorFilter mf = new MonitorFilter(f, new FileEvent());
        mf.start();
    }
}