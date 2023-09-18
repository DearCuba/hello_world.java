import java.util.Scanner;

public class Lesson_7_3 {

    /**
     * Вычислите факториал введенного с клавиатуры целого числа (...-1, 0, 1, 2...).
     * Используя рекурсивный алгоритм.
     */

    public static void main(String[] args) {

        output(factorial(inputInt()));


    }

    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        int wholeNum = 0;
        System.out.println("Enter an number:");

        // Возвращает истинну если с потока ввода можно считать целое число
        if(input.hasNextInt()) {
            wholeNum = input.nextInt();
            input.close();
            return wholeNum;
        }
        else {
            System.out.println("You entered not an integer. Please try again.");
        }
        return wholeNum;
    }

    public static void output(int x) {
        System.out.println(x);
    }

    public static int factorial(int x) {
        if (x == 1) {

            return 1;
        }
        else {
            return x * factorial(x - 1);
        }

    }


}
