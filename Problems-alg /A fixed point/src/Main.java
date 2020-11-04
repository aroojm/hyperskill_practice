import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = scanner.nextInt();
        }
        System.out.println(fixedPointBinary(arr));
    }

    public static boolean fixedPointBinary(int[] numbers) {
        int left = 0;
        int right = numbers.length -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(numbers[mid] == mid) {
                return true;
            } else if (numbers[mid] > mid) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return false;
    }
}