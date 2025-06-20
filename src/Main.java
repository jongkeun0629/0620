import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);

        double result = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);       // 안전장치

        System.out.println(result);

        // for
        double sum = 0.0;
        for (Double value : values){
            sum += value;
        }
        double avg = sum / values.toArray().length;

        System.out.println(avg);

    }
}