package prog.oop.Lessons_3.BufferedReader;

/*      Написать программу, которая считает текстовый файл, заменит в нем все
        слова “Hello” на “1234” и запишет изменения в тот-же файл*/

import java.io.*;

public class Replacement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\1.txt"));
        String line = "";
        String FileContent = "";
        String NL = System.getProperty("line.separator");
        while ((line = br.readLine()) != null) {
            FileContent = FileContent + line + NL;
        }
        br.close();

        FileContent = FileContent.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)", "1234");
        System.out.println(FileContent);
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\1.txt"));
        bw.write(FileContent);
        bw.close();
    }
}