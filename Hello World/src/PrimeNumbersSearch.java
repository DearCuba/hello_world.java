public class PrimeNumbersSearch {


  // Методы класа:

  //    Метод поиска простых чисел
  static void findPrimeNumber (int[] primeNumbers) {
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
  static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
    boolean isPrime = isPrime(number, primeNumbers, currentIndex);
    if (isPrime) {
      return number;
    }
    number += 2;
    return findNextPrimeNumber(number, primeNumbers, currentIndex);
  }

  //    Метод проверки конкретного числа на простоту
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



  public static void main(String[] args) {
  }

}
