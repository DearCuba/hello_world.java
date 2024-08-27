//import com.walking.counterAggregation.model.Counter;
//import com.walking.counterAggregation.service.CounterService;
//
//public class Buffer_1 {
//  public static void main(String[] args) {
////Main
//      // Создаем объекты
//      Counter gas = new Counter("Gas", "kWh", 3);
//      Counter electricity = new Counter("Electricity", "Ah", 0);
//      Counter hotWater = new Counter("Hot water", "Gcal", 0);
//      Counter coldWater = new Counter("Cold water", "m3", 10);
//
//      // Присваиваем массиву объектов класса CounterService созданные объекты
//      CounterService.countersArray[0] = gas;
//      CounterService.countersArray[1] = electricity;
//      CounterService.countersArray[2] = hotWater;
//      CounterService.countersArray[3] = coldWater;
//
//      // Используем различную логику для теста
//      displayCountersInfo();
//      CounterService.selectCounter();
//      displayCountersInfo();
//
//      CounterService.inputInt.close();
//      CounterService.inputString.close();
//    }
//
//    // Методы класса
//    private static void displayCountersInfo() {
//      System.out.println("Current counters values:");
//
//      for (int i = 0; i < CounterService.countersArray.length; i++) {
//        System.out.printf("%s - %d %s\n", CounterService.countersArray[i].getCounterName(),
//            CounterService.countersArray[i].getCounterValue(),
//            CounterService.countersArray[i].getCounterUnits());
//      }
//      System.out.println();
//    }
//  }
//
//
//
//
