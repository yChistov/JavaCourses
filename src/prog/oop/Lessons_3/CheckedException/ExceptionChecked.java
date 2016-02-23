package prog.oop.Lessons_3.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExceptionChecked {
    public static void main(String[] args) {
        int[] m = {-1, 0, 1};
        int a = 1;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        FileInputStream fis = null;
        try {
            a = sc.nextInt();
            m[a - 1] = 4 / a;
            System.out.println(m[a]);
            String text = null;
            System.out.println(text.lastIndexOf(4));
            System.out.println("Введите максимальное положительное число для определения случайного числа: ");
            int n = r.nextInt(sc.nextInt());
            System.out.println("Случайное число: " + n);
            fis = new FileInputStream("werwer");

        } catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (NullPointerException e) {
            System.out.println("Недопустимое использование нулевой ссылки");
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Вы ввели некорректное число!");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}