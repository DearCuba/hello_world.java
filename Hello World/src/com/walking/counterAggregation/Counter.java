package com.walking.counterAggregation;
import java.util.Scanner;


/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании —
 * counterAggregation.
 * <p>
 * (+) Реализовать класс счетчика, который хранит:
 * + название (counterName)
 * + единицы измерения (counterUnits)
 * + значение (counterValue)
 * + обеспечивает доступ к значениям
 * + название счетчика и его единицы измерения должны быть неизменны
 * <p>
 */

public class Counter {

  static Scanner input = new Scanner(System.in);

  // Поля класса
  private final String counterName;
  private final String counterUnits;
  private int counterValue;

  //Конструкторы класса
  public Counter() {
    this.counterName = "unknown";
    this.counterUnits = "unknown";
  }
  Counter(String counterName, String counterUnits) {
    this.counterName = counterName;
    this.counterUnits = counterUnits;
  }
  Counter(String counterName, String counterUnits, int counterValue) {
    this.counterName = counterName;
    this.counterUnits = counterUnits;
    this.counterValue = counterValue;
  }

  // Геттеры и Сеттеры:
  public String getCounterName() {
    return counterName;
  }

  public String getCounterUnits() {
    return counterUnits;
  }

  public int getCounterValue() {
    return counterValue;
  }

  public void setCounterValue(int counterValue) {
    this.counterValue = counterValue;
  }

  // Методы класса
  public void displayObjectInfo() {
    System.out.printf("%s: %d %s\n", counterName, counterValue, counterUnits);
  }

  public int enterValue(String counterName) {
    System.out.printf("Enter %s value: ", counterName);
    return input.nextInt();
  }
}


