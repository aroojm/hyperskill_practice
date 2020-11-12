import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        int value = s.nextInt();

        int[] a = blockNum(len,arr,value);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] == -1){break;}
        }
    }

    public static int[] blockNum(int size, int[] array, int target) {
        int currentRight = 0;
        int previousRight = 0;

        if (size == 0) {
            return new int[] {-1,0};
        }
        int jumpLength = (int) Math.sqrt(size);
        currentRight = jumpLength - 1;

        while (currentRight < size-1) {

            if (array[currentRight] >= target) {

                break;
            }
            currentRight = Math.min(size-1, currentRight + jumpLength);
            previousRight = currentRight;
        }

        if ((currentRight == size -1) && target > array[currentRight]) {
            return new int[] {-1,0};
        }
        if ( previousRight + jumpLength > size + 1) {
            return new int[] {previousRight, currentRight};
        }

        return new int[] {currentRight - jumpLength + 1 , currentRight};

    }
}