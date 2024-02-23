package Lessons_1_to_10;

import java.util.Scanner;

public class Lesson_7_1 {

        /**
        * (+)  Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
        * (+)  Реализацию конкатенации строк вынести в отдельный метод.
        */

    public static void main(String[] args) {

        //textConcatenation("Hi", "my name", "is Alex.", "And you?");
        String result = textConcatenation("Hi", "my name", "is Alex.", "And you?");

        System.out.println(result);

    }

    static String textConcatenation(String... text) {
        if (text.length == 0) {
            return "Empty...";
        }

        var result = "";
        for(String n : text )
            result += n + " ";

        return result;

    }

}
