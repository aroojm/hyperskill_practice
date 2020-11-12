import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.print(comparison(length, i) + " ");
        }
    }
    public static int comparison(int size, int targetIndx) {
        if (targetIndx == 0) {
            return 1;
        }
        int jumpLength = (int) Math.sqrt(size);
        int numberOfBlocks = (int) Math.ceil((double) size / jumpLength);
        int blockNumber = (int) Math.ceil((double) targetIndx / jumpLength);
        if (blockNumber < numberOfBlocks) {
            return 1 + blockNumber + (blockNumber * jumpLength - targetIndx);
        } else {
            return 1 + blockNumber + (size - 1 - targetIndx);
        }
    }
}
