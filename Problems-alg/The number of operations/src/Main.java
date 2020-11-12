import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int len = s.nextInt();
        int[][] arr = new int[num][len];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[] operationsArray = new int[num];
        for (int i = 0; i < num; i++) {
            operationsArray[i] = countOperations(arr[i]);
        }
        int max = 0;
        for (int i = 0; i < num; i++) {
            if (operationsArray[max] < operationsArray[i]) {
                max = i;
            }
        }
        System.out.print(max + 1);
    }

    public static int countOperations(int[] array) {
        int len = array.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min]) {
                    min = j;
                    count++;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            count++;
        }
        return count;
    }



}
