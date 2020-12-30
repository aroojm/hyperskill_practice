import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class ArrayCalc {


    public static class MinMaxPair {
        private int min;
        private int max;

        public MinMaxPair(int first, int second) {
            this.min = first;
            this.max = second;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }


    public static MinMaxPair findMinMax(int[] array) {

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < first) {
                first = array[i];
            }
            if (array[i] > last) {
                last = array[i];
            }

        }

        return new MinMaxPair(first, last);
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input array 
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayCalc.MinMaxPair p = ArrayCalc.findMinMax(array);

        System.out.println("min = " + p.getMin());
        System.out.println("max = " + p.getMax());
    }
}