import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        int value = s.nextInt();
        System.out.print(comparison(len, arr, value));
    }
    public static int comparison(int size, int[] array, int target) {
        int currentRight = 0;
        int previousRight = 0;
        int num = 0;
        if (array[currentRight] == target) {
            return ++num;
        }
        int jumpLength = (int) Math.sqrt(size);
        while (currentRight < size - 1) {
            currentRight = Math.min(size - 1, currentRight + jumpLength);
            num++;
            if (array[currentRight] >= target) {
                if (array[currentRight] == target) {
                    return ++num;
                }
                break;
            }
            previousRight = currentRight;
        }
        if (currentRight == size - 1 && target > array[currentRight]) {
            return ++num;
        }
        return num + backward(array, target, previousRight, currentRight);
    }
    public static int backward(int[] array, int target, int left, int right) {
        int count = 0;
        for (int i = right; i > left; i--) {
            count++;
            if (array[i] <= target) {
                return count;
            }
        }
        return count;
    }
}