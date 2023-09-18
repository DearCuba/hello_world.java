import java.util.Scanner;

public class Lesson_4_5_2 {

    /**
     * Выводить на экран "Не угадал!" до тех пор,
     * пока с клавиатуры не будет введено число 1.
     * Запрашивать число с клавиатуры после выводом на экран "Не угадал!"
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

//        Сначала выведем фразу в первый раз, а лишь потом начнем запрашивать число
            do {
                System.out.println("Did not guess!");
            } while (scanner.nextInt() != 1);
            scanner.close();
        }
}

