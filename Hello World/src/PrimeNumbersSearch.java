import java.util.Scanner;

public class PrimeNumbersSearch {

  public static Scanner scanner = new Scanner(System.in);



  //  Поля класса:


  //  Конструкторы класса:


  //  Методы класа:

  //    Метод поиска простых чисел
  public static void findPrimeNumber (int[] primeNumbers) {
    for (int i = 0; i < primeNumbers.length; i++) {
      if (i == 0) {
        primeNumbers[i] = 2;
      } else {
        int addingValue = i == 1 ? 1 : 2;
        int number = primeNumbers[i - 1] + addingValue;
        primeNumbers[i] = findNextPrimeNumber(number, primeNumbers, i);
      }
    }
  }

  //    Метод проверки нового числа на простоту и заполнения массива
  public static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
    boolean isPrime = isPrime(number, primeNumbers, currentIndex);
    if (isPrime) {
      return number;
    }
    number += 2;
    return findNextPrimeNumber(number, primeNumbers, currentIndex);
  }

  //    Метод проверки конкретного числа на простоту
  public static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
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
  public static int sum(int[] numbers) {
    return sum(numbers, 0);
  }

  public static int sum(int[] numbers, int i) {

    if (i == numbers.length - 1) {
      return numbers[i];
    } else {
      return numbers[i] + sum(numbers, i + 1);
    }
  }

  //  Метод вывода суммы первых n задданных пользователем чисел массива
  public static int sumFirstArrayNum(int[] numbers, int arraySum) {

    System.out.print("Input sumNum: ");
    int num = scanner.nextInt();
    int length = numbers.length;

    for (int i = 0; i < num && i < length; i++){
      System.out.print(numbers[i] + " ");
      arraySum = arraySum + numbers[i];
    }
    System.out.println();
    return arraySum;
  }

  public static void main(String[] args) {
  }

}
