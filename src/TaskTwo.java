import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class TaskTwo {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("function.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                numbers.add(Double.parseDouble(s));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
    }

}
