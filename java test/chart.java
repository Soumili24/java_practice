import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class chart {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a string:");
            String input = reader.readLine();
            
            System.out.println("Enter the character to count:");
            char target = (char) reader.read();

            int frequency = 0;
            for (char c : input.toCharArray()) {
                if (c == target) {
                    frequency++;
                }
            }
            System.out.println("The frequency of '" + target + "' is: " + frequency);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}