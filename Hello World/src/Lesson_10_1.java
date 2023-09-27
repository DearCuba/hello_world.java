import java.util.Scanner;

/**
 * 1) Используя кодовую базу из задачи 6_3 вынести строковые и символьные литералы в константы.
 * (+) 2) Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 * (+) 3) Также попробуйте записать в константу переменную scanner.
 * (+) 4) Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */

public class Lesson_10_1 {

  // Поля класа:
  public static String vertical = "|";
  public static String horizontal = "=";
  public static String corner = "*";
  public static String space = " ";

  public static void main(String[] args) {

// Вводим значения длины и ширины прямоугольника
    System.out.print("Input length of rectangle: ");
    int length = scanner();
    System.out.print("Input width of rectangle: ");
    int width = scanner();

// Выводим прямоугольник в консоль используя методы
    stick(corner, width);
    body(length, width);
    stick(corner, width);
  }

// Методы:
  public static int scanner() {
    Scanner scanner = new Scanner(System.in);
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
