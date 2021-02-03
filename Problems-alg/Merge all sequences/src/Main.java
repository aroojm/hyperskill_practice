import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); // number of arrays
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            scanner.nextLine(); // consume the end of line
            int num = scanner.nextInt(); // length of each array
            for (int j = 0; j < num; j++) {
                list.add(scanner.nextInt());
            }
        }
        // arraysList to array conversion
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        // sort array
        Arrays.sort(array);
        // print array elements in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}