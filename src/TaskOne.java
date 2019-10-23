import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

public class TaskOne {

    private static BigDecimal func(double x) {
        return BigDecimal.valueOf(x * x + 2 * x + 3).setScale(2, RoundingMode.FLOOR);
    }

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("function.txt", StandardCharsets.UTF_8)) {
            for (double i = 1; i <= 2; i += 0.01) {
                writer.println(func(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
