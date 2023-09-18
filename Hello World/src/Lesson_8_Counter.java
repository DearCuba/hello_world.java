import java.util.Scanner;

public class Lesson_8_Counter {

// Поля класса:
    public String countName;
    public int countStart;

    public int rangeMin;

    public int rangeMax;

// Инициализаторы
    {
        countStart = 0;
    }

// Контрукторы класа:
    public Lesson_8_Counter(String countName) {
        this(countName, 0);
        }

    public Lesson_8_Counter(String countName, int countStart) {
        this.countName = countName;
        this.countStart = countStart;
    }

    Lesson_8_Counter(int min, int max) {
        this.rangeMin = min;
        this.rangeMax = max;
    }

// Методы класса:
    public void displayInfo() {
     System.out.printf("Name: %s \tCount: %d\n", countName, countStart);
    }

    public void displayRange() {
        System.out.printf("Min: %d \tMax: %d\n", rangeMin, rangeMax);
    }

    public void increment() {
        countStart++;
    }

    public void decrement() {
        countStart--;

    }

    public void userIncrement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        double num = scanner.nextDouble();

        if (num % 2 != 1 && num % 2 != 0) {
            do {
                System.out.println("This is not an integer!");
                System.out.print("Enter an integer: ");
                num = scanner.nextDouble();

            } while (num % 2 != 1 && num % 2 != 0);

        }
        countStart += num;
    }

    public void userDecrement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        double num = scanner.nextDouble();

        if (num % 2 != 1 && num % 2 != 0) {
            do {
                System.out.println("This is not an integer!");
                System.out.print("Enter an integer: ");
                num = scanner.nextDouble();

            } while (num % 2 != 1 && num % 2 != 0);

        }
        countStart -= num;
    }

    public static void main (String[] args) {
    }

}

