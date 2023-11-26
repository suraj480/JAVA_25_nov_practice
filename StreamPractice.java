import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 3, 1, 5, 9, 7,6);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 =s2.map(n->n*2);
       // s2.forEach(n -> System.out.println(n));
        s3.forEach(n -> System.out.println(n));
    }
}
