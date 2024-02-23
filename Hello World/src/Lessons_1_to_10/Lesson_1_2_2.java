package Lessons_1_to_10;

public class Lesson_1_2_2   {
    public static void main(String[] args) {

        /**
         * Усложнение для внимательных: вывести ваше имя посимвольно,
         * где каждая буква — на новой строке, не используя System.out.println().
         * Реализуется с использованием String.
         */

        /*
         * Объявляем переменную типа String и инициализируем ее своим именем.
         * После каждой буквы имени указываем управляющий символ \n,
         * который переводит курсор на новую строку
         * */
        String s = "A\nl\ne\nx";
//        Выводим в консоль значение переменной s
        System.out.print(s);
    }

    /*
     * Примечание: если вы установили Java 15 или выше, вам доступен функционал текстовых блоков.
     * Они упрощают решение и позволяют его свести к
     *
     * String s = """
     *          Е
     *          г
     *          о
     *          р""";
     *
     *  System.out.print(s);
     *
     * Данное решение тоже допустимо
     * */
}