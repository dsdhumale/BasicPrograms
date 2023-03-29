import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,13,5,7,9,22);
        num.stream().sorted().filter(n -> n%2 ==1).map(n -> n*2).forEach(n -> System.out.println(n));
        // System.out.println(data);
        
    }
}
