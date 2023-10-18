public class Main {

  /**
   * (+) 1) Вынесите поиск простых чисел в отдельный класс.
   * <p>
   * 2) Реализуйте возможность вывода на экран суммы N первых простых чисел,
   *    где N – число, введенное пользователем с клавиатуры;
   * <p>
   * 3) Вынесите нужные вам переменные в поля класса.
   *    Если необходимо – сделайте их константами уровня класса или объекта.
   *    Помните, константа ссылочного типа гарантирует неизменность ссылки,
   *    а не содержимого объекта. Массив – ссылочный тип.
   * <p>
   */

  public static void main(String[] args) {

    int[] primeNumbers = new int[10];

    PrimeNumbersSearch.findPrimeNumber(primeNumbers);

    System.out.println(sum(primeNumbers));

  }

  //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
  static int sum(int[] numbers) {
    return sum(numbers, 0);
  }

  static int sum(int[] numbers, int i) {
    if (i == numbers.length - 1) {
      return numbers[i];
    }

    return numbers[i] + sum(numbers, i + 1);
  }
}