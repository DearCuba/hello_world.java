import java.util.Scanner;

public class Lesson_8_Main {


    public static void main(String[] args) {

// Создаем объеты
        Lesson_8_Counter onePar = new Lesson_8_Counter("One");
        onePar.displayInfo();

        Lesson_8_Counter twoPar = new Lesson_8_Counter("Two", 10);
        twoPar.displayInfo();

        Lesson_8_Counter evenCount = new Lesson_8_Counter("Even");
        evenCount.displayInfo();

        Lesson_8_Counter oddCount = new Lesson_8_Counter("Odd");
        oddCount.displayInfo();

        Lesson_8_Counter range = new Lesson_8_Counter(1, 200);
        range.displayRange();

//// Используем методы increment и decrement
        onePar.increment();
        onePar.decrement();
        onePar.displayInfo();

        twoPar.increment();
        twoPar.decrement();
        twoPar.displayInfo();

//// Используем методы userIncrement и userDecrement
        onePar.userIncrement();
        onePar.displayInfo();

        twoPar.userDecrement();
        twoPar.displayInfo();

// Используем подсчет четных и нечетных цифр в диаопозоне от 1 до 100

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper limit to count even and odd numbers: ");
        range.rangeMax = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= range.rangeMax; i++) {

            if (i % 2 == 0) {
                evenCount.increment();
            } else {
                oddCount.increment();
            }
        }

        evenCount.displayInfo();
        oddCount.displayInfo();
    }

}
