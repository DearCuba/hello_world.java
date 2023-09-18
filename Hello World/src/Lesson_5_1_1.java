public class Lesson_5_1_1 {

    /**
     * Создать массив char, заполненный буквами своего имени в верном порядке.
     * Используя этот массив, вывести свое имя в консоль.
     * Предварительно собрать значения массива в переменную типа String.
     */

        public static void main(String[] args) {
            char[] nameArray = new char[]{'A', 'l', 'e', 'x'};
            String name = "";

            for (char ch : nameArray) {
                name += ch;
                System.out.println(name);
            }

            System.out.print(name);
        }
}
