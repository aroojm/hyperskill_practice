import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int binarySearch(int[] numbers, int value) {
        int left = 0;
        int right = numbers.length -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(numbers[mid] == value) {
                return mid+1;
            } else if (numbers[mid] > value) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len1 = scanner.nextInt();
        int[] arr1 = new int[len1];
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = scanner.nextInt();
        }
        int len2 = scanner.nextInt();
        int[] arr2 = new int[len2];
        for (int k = 0; k < arr2.length; k++) {
            arr2[k] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(binarySearch(arr1,arr2[i]) + " ");

        }
    }
}
