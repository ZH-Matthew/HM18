import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(129,129,128,5,8,23,24,48,1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        Service.task1(nums);
        Service.task2(nums);
        Service.task3(strings);
        Service.task4(strings);
    }
}