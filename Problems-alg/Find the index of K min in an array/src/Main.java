import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findIndexOfKMin(int[] numbers, int k) {
        if (numbers.length == 0) {
            return -1;
        } else {
            int min = findMin(numbers);
            int index = -1;
            int counter = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == min) {
                    counter++;
                    if (counter == k) {
                        return i;
                    }
                }
            }
            return index;
        }

    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int k;
        final int[] numbers;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 1;
        }
        System.out.println(findIndexOfKMin(numbers, k));
    }
}