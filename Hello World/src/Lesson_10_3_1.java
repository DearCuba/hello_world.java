public class Lesson_10_3_1 {

  /**
   * 1) Вынесите поиск простых чисел в отдельный класс.
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

    for (int i = 0; i < primeNumbers.length; i++) {
      if (i == 0) {
        primeNumbers[i] = 2;
      } else {
        int addingValue = i == 1 ? 1 : 2;
        int number = primeNumbers[i - 1] + addingValue;
        primeNumbers[i] = findNextPrimeNumber(number, primeNumbers, i);
      }
    }

    System.out.println(sum(primeNumbers));
  }
  //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
  //    заполнения одного элемента массива

  static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
    boolean isPrime = isPrime(number, primeNumbers, currentIndex);

    if (isPrime) {
      return number;
    }

    number += 2;

    return findNextPrimeNumber(number, primeNumbers, currentIndex);
  }

  //    Метод проверки конкретного числа на то, является ли оно простым

  static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
    int j = 0;
    boolean isPrime = true;

    while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
      if (number % primeNumbers[j] == 0) {
        isPrime = false;
      } else {
        j++;
      }
    }
    return isPrime;
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
