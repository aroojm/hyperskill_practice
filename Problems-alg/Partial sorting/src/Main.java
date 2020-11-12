import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }
        int k = Integer.parseInt(scanner.next());
       // s.close();

        for (int i = 0; i < n - 1; i++) {
            int maxIndx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[maxIndx] < arr[j]){
                    maxIndx = j;
                }
            }
            int temp = arr[maxIndx];
            arr[maxIndx] = arr[i];
            arr[i] = temp;
            if (i + 1 == k){
                break;
            }
        }
        for (int z = 0; z < k; z++) {
            System.out.print(arr[z] + " ");
        }
    }


}