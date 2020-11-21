import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int minMax = findMax(generateArray(a, n, k));
        int s = a;
        for (int i = a + 1; i <= b; i++) {
            int[] array = generateArray(i, n, k);
            int localMax = findMax(array);
            if (localMax < minMax) {
                minMax = localMax;
                s = i;
            }
        }
        System.out.println(s);
        System.out.println(minMax);
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] generateArray(int seed, int size, int bound) {
        int[] arr = new int[size];
        Random r = new Random(seed);
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(bound);
        }
        return arr;
    }
}