import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] countOccurrences(int[] first, int[] second) {
        int[] arr = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            arr[i] = countOcc(second, first[i]);
        }
        return arr;
    }

    public static int countOcc(int[] numbers, int value) {
        int count = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] == value){ count++;}
        }
        return count;

    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}