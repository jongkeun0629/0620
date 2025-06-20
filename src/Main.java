import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream().
                filter((n) -> n % 2 == 0).
                mapToInt(Integer::intValue).      // stream 형태. int 형으로 바꿔주어야함
                sum();

        System.out.println(result);

        // for
        int sum = 0;
        for (Integer number : numbers){
            if (number % 2 == 0){
                sum += number;
            }
        }

        System.out.println(sum);
    }
}