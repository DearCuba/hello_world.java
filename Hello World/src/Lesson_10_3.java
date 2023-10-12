import java.math.BigInteger;
import java.util.Scanner;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */

public class Lesson_10_3 {

// Поля и методы класса
  public static final int arraySize = 5;
  public static int arrayCount = 0;
  public static int[] arrayPrimeNumbers = new int[arraySize];
  public static final String requiredMessageIn = "Input prime number: ";
  public static final Scanner scanner = new Scanner(System.in);


  public static void main(String[] args) {

    for (int i = 0; arrayCount < arraySize; i++) {

      if (i % 2 == 0 & i != 0) {
        arrayPrimeNumbers[arrayCount] = i;
        arrayCount++;
      }
    }

    for (int i : arrayPrimeNumbers){
      System.out.print("[ " + i + " ]");
    }

    System.out.println();
    System.out.println(checkPrime(9));
  }


// Метод сканнер
  public static int scanner() {
    System.out.print(requiredMessageIn);
    return scanner.nextInt();
  }

// Метод "Тест простоты Миллера-Рабина" + сканнер
  public static boolean checkPrime(){
    int setPrime = scanner();
    scanner.close();
    BigInteger bigInteger = BigInteger.valueOf(setPrime);
    return bigInteger.isProbablePrime((int) Math.log(setPrime));
  }

  // Метод "Тест простоты Миллера-Рабина"
  public static boolean checkPrime(int i){
    int setPrime = i;
    scanner.close();
    BigInteger bigInteger = BigInteger.valueOf(setPrime);
    return bigInteger.isProbablePrime((int) Math.log(setPrime));
  }

// Метод изменения массива и вывода его в консоль
  public static int[] returnArray(int[] arrayPrimeNumbers) {
    int length = arrayPrimeNumbers.length;
    for (int i = 0; i < length; i++) {
      arrayPrimeNumbers [i] = i;
      System.out.print(arrayPrimeNumbers [i] + " ");
    }
    System.out.println();
    return arrayPrimeNumbers;
  }
}
