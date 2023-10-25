import java.util.Scanner;

public class Main {

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

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int arraySize = 10;

    int[] primeNumbers = new int[arraySize];

    int arraySum = 0;

    PrimeNumbersSearch.findPrimeNumbers(primeNumbers);

    System.out.println(PrimeNumbersSearch.sumAllArrayNum(primeNumbers));

    System.out.println(PrimeNumbersSearch.sumFirstArrayNum(primeNumbers, arraySum));

  }

}
