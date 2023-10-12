import java.math.BigInteger;
import java.util.Scanner;

/**
 * (+) 1)Вычислить из записать в массив первые 10 простых чисел.
 * (+) 2)Вывести в консоль сумму всех элементов полученного массива.
 */

public class Lesson_10_3 {

// Поля и методы класса
  public static final int arraySize = 10;
  public static int arrayCount = 0;
  public static int Sum = 0;

  public static int[] arrayPrimeNumbers = new int[arraySize];

  public static final String requiredMessageIn = "Input prime number: ";
  public static final Scanner scanner = new Scanner(System.in);


  public static void main(String[] args) {

    arrayPrimeFind();

    for (int arrayPrimeNumber : arrayPrimeNumbers) {
      Sum += arrayPrimeNumber;
    }
    System.out.println(Sum);
  }


// Метод сканнер
  public static int scanner() {
    System.out.print(requiredMessageIn);
    return scanner.nextInt();
  }


// Метод поика целого числа и записи его в массив
  public static void arrayPrimeFind () {
    for (int i = 2; arrayCount < arraySize; i++) {
      if (checkPrime(i)) {
        arrayPrimeNumbers[arrayCount] = i;
        arrayCount++;
      }
    }
  }


// Метод "Тест простоты Миллера-Рабина"
  public static boolean checkPrime(int setPrime){
    BigInteger bigInteger = BigInteger.valueOf(setPrime);
    return bigInteger.isProbablePrime((int) Math.log(setPrime));
  }
}

