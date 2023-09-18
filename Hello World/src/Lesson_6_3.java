import java.util.Scanner;

public class Lesson_6_3 {
    public static void main(String[] args) {
        /*
         * Урок №6
         * Методы. Первое знакомство. Параметры. Возвращение значений.
         * Задание №3:
         * (+) Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
         * (+) Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
         * (+) Углы прямоугольника обозначить символом “ “.
         * (+) Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
         * (+) Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
         */

        // Вводим значения длины и ширины прямоугольника
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length and width of recatangle:");
        int length = input.nextInt();
        int width = input.nextInt();

        input.close();

        String upCorner = ".";
        String downCorner = "'";

        // Выводим прямоугольник в консоль используя методы
        stick(".", width);
        body(length, width);
        stick("'", width);
    }

     // Тут пишем методы

     // Выводим в консоль верхнюю и нижнюю часть прямоугольника
    static void stick(String corner, int width) {
        System.out.print(corner);
        for(int a = 1; a <= width; a++) {
            System.out.print("-");
        }
        System.out.println(corner);
    }

    // Выводим в консоль боковые части прямоугольника
    static void body(int length, int width) {
        for (int b = 1; b <= length; b++) {
            System.out.print("|");
            for(int c = 1; c <= width; c++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

