package com.walking.counterAggregation;

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании —
 * counterAggregation.
 * <p>
 * Также реализовать сервис CounterService, зона ответственности которого:
 * - хранение массива доступных счетчиков
 * - получение всех доступных счетчиков
 * - получение доступа к счетчику по названию
 * - увеличение значения счетчика на единицу или заданное значение
 * - сброс счетчика до нулевого значения.
 * <p>
 */

public class CounterService {

    public static void main(String[] args) {
        Counter[] counters = new Counter[2];
        counters[0] = new Counter();
        counters[1] = new Counter("11","22", 33);

        for (int i = 0; i < counters.length; i++) {
            System.out.println(counters[i].getCounterName());
            System.out.println(counters[i].getCounterUnits());
            System.out.println(counters[i].getCounterValue());
        }
    }
}
