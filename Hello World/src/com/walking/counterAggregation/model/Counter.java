package com.walking.counterAggregation.model;

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании —
 * counterAggregation.
 * <p>
 * (+) Реализовать класс счетчика, который хранит:
 * (+) название (name)
 * (+) значение (value)
 * (+) единицы измерения (units)
 * (+) название счетчика и его единицы измерения должны быть неизменны
 * (+) обеспечить доступ к значениям
 * <p>
 */

public class Counter {
  private final String name;
  private final String unit;

  private int value;

  public Counter(String name, String unit) {
    this(name, unit, 0);
  }

  public Counter(String name, String unit, int value) {
    this.name = name;
    this.unit = unit;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getUnit() {
    return unit;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}