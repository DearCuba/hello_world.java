package Lessons_1_to_10;

public class Lesson_1_2_3 {
        public static void main(String[] args) {

            /**
             * Используя несколько переменных типа char вывести свое имя в консоль.
             */

//        Объявляем переменную типа char и инициализируем ее буквой имени
            char ch1 = 'A';
//        Выводим значение переменной ch1 в консоль
            System.out.print(ch1);

//        Повторяем действия до тех пор, пока буквы в имени не кончатся
            char ch2 = 'l';
            System.out.print(ch2);

            char ch3 = 'e';
            System.out.print(ch3);

            char ch4 = 'x';
            System.out.print(ch4);
        }

        /*
         * Примечание: также можно было выводить не символы, а строки вида "" + ch1 + ch2..., например:
         * System.out.print("" + ch1 + ch2 + ch3 + ch4);
         *
         * Однако на данном этапе конкатенация строк не была пройдена
         * */
}

