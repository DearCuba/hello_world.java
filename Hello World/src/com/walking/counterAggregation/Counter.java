package com.walking.counterAggregation;

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании —
 * counterAggregation.
 * <p>
 * (+) Реализовать класс счетчика, который хранит: (+) название (counterName) (+) единицы измерения
 * (counterUnits) (+) значение (counterValue) (+) название счетчика и его единицы измерения должны
 * быть неизменны (+) обеспечить доступ к значениям
 * <p>
 */

public class Counter {

  // Поля класса
  private final String counterName;
  private final String counterUnits;
  private int counterValue;

  //Конструктор класса
  Counter(String counterName, String counterUnits, int counterValue) {
    this.counterName = counterName;
    this.counterUnits = counterUnits;
    this.counterValue = counterValue;
  }

  // Геттеры и сеттеры
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
}


