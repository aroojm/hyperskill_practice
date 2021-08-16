import java.util.Scanner;

class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int len = scanner.nextInt();
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = scanner.nextInt();
            }
            int count = 0;

            for (int i = 1; i < len; i++) {
                int value = arr[i];
                int j = i - 1;
                boolean flag = false;
                while (j >= 0 && arr[j] < value){
                    arr[j+1] = arr[j];
                    j--;
                    flag = true;
                }
                arr[j+1] = value;
                if (flag) {count++;}
            }

            System.out.print(count);
        }
    }
