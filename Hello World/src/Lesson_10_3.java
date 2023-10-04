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
  //int[] primeNumbers = new int[10];
  public static final String requiredMessageIn = "Input prime number: ";
  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(checkPrime());
  }

// Метод сканнер
  public static int scanner() {
    System.out.print(requiredMessageIn);
    return scanner.nextInt();
  }

// Метод "Тест простоты Миллера-Рабина"
  public static boolean checkPrime(){
    int setPrime = scanner();
    scanner.close();
    BigInteger bigInteger = BigInteger.valueOf(setPrime);
    boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(setPrime));
    return probablePrime;
  }


}
