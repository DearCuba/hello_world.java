import java.util.Scanner;

public class Lesson_3_1 {

    /**
     * Ввести с клавиатуры два целых числа. Если Число1 четное,
     * вывести произведение двух чисел(пр.1) если нет - частное(пр.2).
     * Также если числа равны - вывести надпись "числа равны!"
     * <p>
     * пр1.: "Число1 * Число2 = Произведение",
     * где число1 - значение 1го числа, число2 - значение 2го числа,
     * Произведение - результат умножения.
     * <p>
     * пр2.: "Число1 / Число2 = Частное",
     * где число1 - значение 1го числа, число2 - значение 2го числа,
     * Частное - результат деления.
     * <p>
     * Помните, что результат деления двух чисел – тоже целое число.
     */

        public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
            Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter a: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
            System.out.print("Enter a: ");
//        Объявляем переменную а типа int и записываем в нее значение, введенное с клавиатуры
            int a = scanner.nextInt();

//        Повторяем те же действия для b
            System.out.print("Enter b: ");
            int b = scanner.nextInt();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
            scanner.close();


            if (a % 2 == 0) {   // Если а делится на 0 без остатка, то значение а - четное
//            Если а - четное, выводим сообщение с произведением двух чисел
                System.out.printf("Number1 * Number2 = %d", a * b);
            } else if (b == 0) {   // Если а - нечетное, сравниваем b с 0. Делить на 0 нельзя
//            Если b == 0, выводим сообщение о недопустимости действия
                System.out.print("Division by 0 is not allowed!");
            } else {   // Для всех иных случаев (а - нечетное и b != 0)
//            Выводим сообщение с частным двух чисел
                System.out.printf("Number1 / Number2 = %f", (double) a / b);
            }

            if (a == b) {   // Если а == b
                /*
                 * Переводим курсор на новую строку,
                 * потому что выше в данном решении использовался printf, в не println
                 * и выводим сообщение о равенстве двух чисел
                 */
                System.out.print("\nThe numbers are equal!");
            }
        }
    }
