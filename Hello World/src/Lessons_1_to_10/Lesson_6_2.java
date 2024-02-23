package Lessons_1_to_10;

import java.util.Scanner;

public class Lesson_6_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                       // Вводим два числа
        System.out.println("Enter the first and second integer: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        checkMultiplicity1(num1, num2);
        checkMultiplicity2(num1, num2);
    }


        static void checkMultiplicity1(int num1, int num2) {
            if (num1 % 2 == 0 || num2 % 3 == 0) {                       // num1 проверяем на четость, num2 на кратность 3
                if (num1 > num2) {
                    System.out.println("num1 > num2");                  // Сравниваем два числа >/</=
                } else if (num1 < num2) {
                    System.out.println("num1 < num2");
                } else {
                    System.out.println("num1 = num2");
                }
            }
        }


   static void checkMultiplicity2(int num1, int num2) {

       if(num1 % 2 == 0 || num1 % 3 == 0 ) {                             // Провряем num1 на кратность 2 и 3
           double exp = Math.pow(num1, num2);                         // Возводим num1 в степерь num2

           if (exp > 2147483647 || exp < -2147483648) {                  // Проврем выходит ли результат за пределы int
               System.out.println("The result of the expression is too big!");
           }
           else {
               System.out.println(exp);
           }
       }
    }
}

