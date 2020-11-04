import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean contains(int[] numbers, int number) {
        if(numbers.length == 0) {return false;}
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number){flag = true; break;}
        }
        return flag;

    }


    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        final int k;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 10;
        }
        System.out.println(contains(numbers, k));
    }
}