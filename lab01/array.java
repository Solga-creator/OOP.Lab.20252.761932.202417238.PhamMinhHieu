import java.util.Arrays;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        // Default array
        int[] array = {1789, 2035, 1899, 1456, 2013};
    
        System.out.print("Enter numbers separated by space (or press Enter to use default): ");
        String input = scanner.nextLine().trim();
        
        if (!input.isEmpty()) {
            String[] numbersStr = input.split("\\s+");
            array = new int[numbersStr.length];
            
            for (int i = 0; i < numbersStr.length; i++) {
                array[i] = Integer.parseInt(numbersStr[i]);
            }
        } else {
            System.out.println("Using default array: " + Arrays.toString(array));
        }
        Arrays.sort(array);
        System.out.println("Sorted array   : " + Arrays.toString(array));
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        double average = (double) sum / array.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average value: " + average);
        
        scanner.close();
    }
}