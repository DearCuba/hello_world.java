//import com.walking.counterAggregation.model.Counter;
//import com.walking.counterAggregation.service.CounterService;
//import java.util.Scanner;
//
//public class Buffer_3 {
//
////CounterService
//  // Создаем массив объектов
//  protected static Counter[] countersArray = new Counter[4];
//
//  // Методы класса
//  public static Scanner inputInt = new Scanner(System.in);
//  public static Scanner inputString = new Scanner(System.in);
//
//  public static void resetCounterValue(Counter counterValue) {
//    counterValue.setCounterValue(0);
//  }
//
//  public static void incrementCounterValue(Counter counterValue) {
//    counterValue.setCounterValue(counterValue.getCounterValue() + 1);
//  }
//
//  public static void incrementCounterValueByUserValue(Counter counterValue) {
//    counterValue.setCounterValue(inputInt.nextInt());
//  }
//
//  public static void showCountersArrayList() {
//    System.out.println("Available counters:");
//
//    for (int i = 0; i < countersArray.length; i++) {
//      System.out.printf("%s\n", CounterService.countersArray[i].getCounterName());
//    }
//    System.out.println();
//  }
//
//  public static void showAvailableOperationsList() {
//    System.out.println(
//        """
//            Available operations:
//            1) Increment value by one
//            2) Increment value by user value
//            3) Reset value
//            4) Choose a different counter
//            5) Exit program
//            """);
//  }
//
//  public static void selectCounter() {
//    CounterService.showCountersArrayList();
//    System.out.println("Please select counter:");
//
//    switch (inputString.nextLine()) {
//      case "Gas" -> {
//        showAvailableOperationsList();
//        System.out.printf("Please select number of operation with %s: \n",
//            countersArray[0].getCounterName());
//        selectOperation(countersArray[0].getCounterName(), countersArray[0]);
//      }
//      case "Electricity" -> {
//        showAvailableOperationsList();
//        System.out.printf("Please select number of operation with %s: \n",
//            countersArray[1].getCounterName());
//        selectOperation(countersArray[1].getCounterName(), countersArray[1]);
//      }
//      case "Hot water" -> {
//        showAvailableOperationsList();
//        System.out.printf("Please select number of operation with %s: \n",
//            countersArray[2].getCounterName());
//        selectOperation(countersArray[2].getCounterName(), countersArray[2]);
//      }
//      case "Cold water" -> {
//        showAvailableOperationsList();
//        System.out.printf("Please select number of operation with %s: \n",
//            countersArray[3].getCounterName());
//        selectOperation(countersArray[3].getCounterName(), countersArray[3]);
//      }
//      default -> {
//        System.out.println("Selected counter does not exist\n");
//        selectCounter();
//      }
//    }
//  }
//
//  public static void selectOperation(String counterName, Counter countersArray) {
//
//    switch (inputString.nextInt()) {
//      case 1 -> {
//        incrementCounterValue(countersArray);
//        System.out.printf("%s counter increased by one\n", counterName);
//      }
//      case 2 -> {
//        System.out.printf("Enter %s value:\n", counterName);
//        incrementCounterValueByUserValue(countersArray);
//      }
//      case 3 -> {
//        resetCounterValue(countersArray);
//        System.out.printf("%s counter reset\n", counterName);
//      }
//      case 4 -> selectCounter();
//      case 5 -> {
//        System.out.println("Bye :)");
//        System.exit(0);
//      }
//      default -> {
//        System.out.println("Selected operation does not exist.\n");
//        System.out.printf("Please select number of operation with %s: \n", counterName);
//        selectOperation(counterName, countersArray);
//      }
//    }
//
//}
