package Lessons_1_to_10;

import java.util.Scanner;

/**
 * (+) 1) Используя кодовую базу из задачи 6_3 вынести строковые и символьные литералы в константы.
 * (+) 2) Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 * (+) 3) Также попробуйте записать в константу переменную scanner.
 * (+) 4) Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */

public class Lesson_10_1 {

  // Задаем поля класа для сканнера:
  public static final String RECTANGLE_LENGTH_REQUIRE_MESSAGE = "Input length of rectangle: ";
  public static final String RECTANGLE_WIDTH_REQUIRE_MESSAGE = "Input width of rectangle: ";

  // Задаем поля класа для прямоугольника:
  public static final String vertical = "||";
  public static final String horizontal = "==";
  public static final String corner = "* ";
  public static final String space = "  ";

  // Создем сканнер:
  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

// Вводим значения длины и ширины прямоугольника
    int length = scanner(RECTANGLE_LENGTH_REQUIRE_MESSAGE);
    int width = scanner(RECTANGLE_WIDTH_REQUIRE_MESSAGE);
    scanner.close();

// Выводим прямоугольник в консоль используя методы
    stick(corner, width);
    body(length, width);
    stick(corner, width);
  }

// Методы:
  public static int scanner(String requiringMessage) {
    System.out.print(requiringMessage);
    return scanner.nextInt();
  }

// Выводим в консоль верхнюю и нижнюю часть прямоугольника
  static void stick(String corner, int width) {
    System.out.print(corner);
    for(int a = 1; a <= width; a++) {
      System.out.print(horizontal);
    }
    System.out.println(corner);
  }

  // Выводим в консоль боковые части прямоугольника
  static void body(int length, int width) {
    for (int b = 1; b <= length; b++) {
      System.out.print(vertical);
      for(int c = 1; c <= width; c++) {
        System.out.print(space);
      }
      System.out.println(vertical);
    }

  }

}
