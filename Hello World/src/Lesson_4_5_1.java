import java.util.Scanner;

public class Lesson_4_5_1 {

    /**
     * Выводить на экран "Не угадал!" до тех пор,
     * пока с клавиатуры не будет введено число 1.
     * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.nextInt() != 1) {
                while (scanner.nextInt() != 1) {//Перед каждым выводом фразы будет запрашиваться число
                    System.out.println("Did not guess!");
                }

                scanner.close();
            }
        }
}


