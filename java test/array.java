import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of the array:");
            int size = Integer.parseInt(reader.readLine());
            int[] numbers = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
            }

            Arrays.sort(numbers);

            System.out.println("Sorted array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}