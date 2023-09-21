import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 1) Используя кодовую базу из задачи 6_3 вынести строковые и символьные литералы в константы.
 * 2) Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 * 3) Также попробуйте записать в константу переменную scanner.
 * Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */

public class Buffer {

  public static void main(String[] args) {

    // Вводим значения длины и ширины прямоугольника
    Scanner input = new Scanner(System.in);

    System.out.println("Input length of rectangle:");
    int length = input.nextInt();
    System.out.println("Input width of rectangle:");
    int width = input.nextInt();

    input.close();

    String upCorner = ".";
    String downCorner = "'";

    // Выводим прямоугольник в консоль используя методы
    stick(".", width);
    body(length, width);
    stick("'", width);
  }


  // Методы:

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














