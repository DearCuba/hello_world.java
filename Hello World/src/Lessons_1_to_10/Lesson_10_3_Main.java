package Lessons_1_to_10;

import java.util.Scanner;

public class Lesson_10_3_Main {

  /**
   * (+) 1) Вынесите поиск простых чисел в отдельный класс.
   * <p>
   * (+) 2) Реализуйте возможность вывода на экран суммы N первых простых чисел,
   *    где N – число, введенное пользователем с клавиатуры;
   * <p>
   * 3) Вынесите нужные вам переменные в поля класса.
   *    Если необходимо – сделайте их константами уровня класса или объекта.
   *    Помните, константа ссылочного типа гарантирует неизменность ссылки,
   *    а не содержимого объекта. Массив – ссылочный тип.
   * <p>
   */

  public static int arraySum = 0;

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    Lesson_10_3_PrimeNumbersSearch ten = new Lesson_10_3_PrimeNumbersSearch(10);
    ten.displayInfo();

    Lesson_10_3_PrimeNumbersSearch.findPrimeNumbers(ten.primeNumbers);

    System.out.println(Lesson_10_3_PrimeNumbersSearch.sumAllArrayNum(ten.primeNumbers));

    System.out.println(Lesson_10_3_PrimeNumbersSearch.sumFirstArrayNum(ten.primeNumbers, arraySum));

  }

}
