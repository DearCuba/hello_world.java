import java.util.Scanner;

public class Lesson_6_1 {

    public static void main(String[] args) {

        /*
         * Написать программу, которая принимает строку с клавиатуры.           +
         * Если строка == "Hi" - вывести в консоль "Hello",                     +
         * если Bye - Good bye,                                                 +
         * если How are you - How are your doing.                               +
         * Если любая другая строка - вывести Unknown message.                  +
         * Сделать через switch-case                                            +
         * Вынести в отдельный метод использование switch-case.                 +
         * Также вынести в отдельный метод использование System.out.println.    +
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String text = in.nextLine();

        in.close();

        display(reply(text));
    }

    static String reply(String message) {

        return switch (message) {
            case "Hi" -> "Hello";
            case "Bye" -> "Good bye";
            case "How are you?" -> "How are your doing?";
            default -> "Unknown message";
        };
    }

    static void display(String text) {
        System.out.println(text);
    }
}