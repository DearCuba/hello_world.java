package com.walking.counterAggregation;

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании —
 * counterAggregation.
 * <p>
 * Реализовать класс Main, ответственность класса:
 * - создание счетчиков
 * - также реализовать в классе Main приватный метод, который позволяет вывести
 * значения счетчиков в виде: <Название счетчика>: <Значение счетчика>.
 * Например:
 * Газ: 2333ч
 * Горячая вода: 0
 * Холодная вода: 23
 * <p>
 */

public class Main {

  public static void main(String[] args) {

    // Создаем объекты
    Counter gas = new Counter("Gas", "kWh");
    gas.displayObjectInfo();

    Counter electricity = new Counter("Electricity", "kWh", 0);
    electricity.displayObjectInfo();

    //Использеум различную логику
    gas.setCounterValue(gas.enterValue(gas.getCounterName()));
    gas.displayObjectInfo();

    System.out.println(gas.getCounterName());
    System.out.println(gas.getCounterValue());
    System.out.println(gas.getCounterUnits());

    System.out.println(" ");

    electricity.setCounterValue(gas.enterValue(electricity.getCounterName()));
    electricity.displayObjectInfo();

    System.out.println(electricity.getCounterName());
    System.out.println(electricity.getCounterValue());
    System.out.println(electricity.getCounterUnits());

    Counter.input.close();

  }
}
