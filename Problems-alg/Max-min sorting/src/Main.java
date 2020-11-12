import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = readArray();
        printArray(maxMinSort(arr));
    }
    public static int[] maxMinSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i += 2) {
            int minIndx = i;
            int maxIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndx]) {
                    maxIndx = j;
                }
            }
            swap(arr, i, maxIndx);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
            }
            swap(arr, i + 1, minIndx);
        }
        return arr;
    }
    public static int[] swap(int[] arr, int l, int m) {
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static int[] readArray() {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
}