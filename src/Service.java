import java.util.*;

public class Service {

    public static void task1(List<Integer> myList) {
        Set<Integer> mySet = new HashSet<>(myList);
        for (Integer i : mySet) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> myList) {
        Set<Integer> mySet = new HashSet<>(myList);
        List<Integer> myList2 = new ArrayList<>(mySet);
        Collections.sort(myList2);
        for (Integer i : myList2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task3(List<String> myList) {
        Set<String> mySet = new HashSet<>(myList);
        System.out.println(mySet);
    }

    public static void task4(List<String> myList) {
        Set<String> mySet = new HashSet<>(myList);
        for (String s : mySet) {
            System.out.println(Collections.frequency(myList, s));
        }
    }
}
