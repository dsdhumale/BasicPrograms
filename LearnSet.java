import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // set.add(3);
        // set.add(7);
        // set.add(7);
        // set.add(15);
        // set.add(40);
        // System.out.println(set);
        // Set<Integer> set = new LinkedHashSet<>();
        // set.add(3);
        // set.add(7);
        // set.add(15);
        // set.add(40);
        // System.out.println(set);
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(40);
        set.add(7);
        set.add(15);
        System.out.println(set);

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        System.out.println(numbers);
        numbers.put(3, "four");
        System.out.println(numbers);




    }
   


}
