import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(findMax(numbers));
    }
}