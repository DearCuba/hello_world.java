package Lessons_1_to_10;

public class Lesson_5_1_2 {

    /**
     * Создать массив char, заполненный буквами своего имени в верном порядке.
     * Используя этот массив, вывести свое имя в консоль.
     * Не использовать переменную типа String.
     */
        public static void main(String[] args) {
            char[] nameArray = new char[]{'A', 'l', 'e', 'x'};

            for (char ch : nameArray) {
                System.out.print(ch);
            }
        }
}

