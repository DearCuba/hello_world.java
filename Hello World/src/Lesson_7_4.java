import java.util.Scanner;

public class Lesson_7_4 {

    /**
     * Вычислите результат выражения, используя рекурсивный алгоритм.
     * (+) n — число, введенное с клавиатуры.
     * (+) Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
     * Выражение: √(1 + √(2 + ... + √n)))
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number <= 0) {
            System.out.print("The number must be at least 1");
            return;
        }

        System.out.println(calculateExpression1(number));


    }


    static double calculateExpression1(int number) {
        return calculateExpression1(1, number);
    }

    static double calculateExpression1(int number, int maxNumber) {
        if (number == maxNumber) {
            return Math.sqrt(number);
        }

        return Math.sqrt(number + calculateExpression1(number + 1, maxNumber));
    }

}
