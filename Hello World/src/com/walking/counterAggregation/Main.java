package com.walking.counterAggregation;

import com.walking.counterAggregation.model.Counter;
import com.walking.counterAggregation.service.CounterService;

/**
 * Разработать программу в рамках компании com.walking,
 * позволяющую следить за счетчиками на газ, холодную воду,
 * горячую воду и электричество.
 * Обозначение программы в рамках компании — counterAggregation.
 * <p>
 * Используя за основу задачу из темы про классы и объекты
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/lesson8_classes_objects">...</a>,
 * реализовать класс счетчика, который хранит название счетчика и его значение,
 * его единицы измерения, а также обеспечивает доступ к значениям.
 * Название счетчика и его единицы измерения должны быть неизменны.
 * <p>
 * Также реализовать сервис CounterService, зона ответственности которого —
 * хранение массива доступных счетчиков, получение всех доступных счетчиков,
 * получение доступа к счетчику по названию,
 * увеличение значения счетчика на единицу или заданное значение,
 * а также сброс счетчика до нулевого значения.
 * <p>
 * Ответственность класса, содержащего main() — создание счетчиков.
 * Сам класс также предлагаю назвать Main.
 * <p>
 * Также реализовать в классе Main приватный метод,
 * который позволяет вывести значения счетчиков в виде:
 * <Название счетчика>: <Значение счетчика>.
 */
public class Main {

  //    Определяем константы
  public static final String GAS_COUNTER_NAME = "Gas";
  public static final String COLD_WATER_COUNTER_NAME = "Cold water";
  public static final String HOT_WATER_COUNTER_NAME = "Hot water";
  public static final String ELECTRIC_COUNTER_NAME = "Electricity";
  public static final String M_3_UNIT = "m3";
  public static final String KW_H_UNIT = "kW/h";

  public static void main(String[] args) {

    //    Создаем счетчики
    Counter gasCounter = new Counter(GAS_COUNTER_NAME, M_3_UNIT);
    Counter coldWaterCounter = new Counter(COLD_WATER_COUNTER_NAME, M_3_UNIT);
    Counter hotWaterCounter = new Counter(HOT_WATER_COUNTER_NAME, M_3_UNIT);
    Counter electricCounter = new Counter(ELECTRIC_COUNTER_NAME, KW_H_UNIT);

    electricCounter.setValue(15);

    //    Создаем объект/сервис (counterService) для управления счетчиками
    CounterService counterService = new CounterService(gasCounter, coldWaterCounter);
    counterService.addCounter(hotWaterCounter);
    counterService.addCounter(electricCounter);

    //    Добавляем два оставшихся счетчика в сервис
    counterService.increaseCounter(GAS_COUNTER_NAME, 100);
    counterService.increaseCounter(coldWaterCounter, 10);

    //    Выводм в консоль значение всех счетчиков
    printCounterValues(counterService.getAllCounters());
  }

    //    Приватный метод который позволяет вывести значения счетчиков
  private static void printCounterValues(Counter[] counters) {
    for (Counter counter : counters) {
      System.out.printf("%s: %s\n", counter.getName(), counter.getValue());
    }
  }
}