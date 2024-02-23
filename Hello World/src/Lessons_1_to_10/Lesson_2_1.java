package Lessons_1_to_10;

import java.util.Scanner;

public class Lesson_2_1 {

    /**
     * Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
     *         c = b*a*(a + b)/(a2),         где a2 - a в квадрате
     * Совпадает ли результат выражения, если a и b — переменные типа int
     * (для проверки не забудьте также использовать подходящий метод Scanner)?
     */

        public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
            Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter a: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
            System.out.print("Enter a: ");
//        Объявляем переменную а типа double и записываем в нее значение, введенное с клавиатуры
            double a = scanner.nextDouble();

//        Повторяем те же действия для b
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
            scanner.close();

//        Объявляем переменную c типа double и записываем в нее результат выражения
            double c = b * a * (a + b) / (a * a);

//        Выводим значение переменной c в консоль
            System.out.println(c);
        }

        /*
         * Примечание: Возводить в степень можно с использованием Math.pow(),
         * не имею ничего против.
         * Однако на данный момент мы еще не знакомились с функциональностью класса Math.
         *
         * При использовании int мы могли потерять дробную часть результата при делении.
         * Также при выводе результата в консоль, используя переменную типа double,
         * мы всегда видим дробную часть, даже если она пуста. Например: 1.0
         * */
}