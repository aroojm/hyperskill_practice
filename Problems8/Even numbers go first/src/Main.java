import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                queue.offerFirst(n);
            } else {
                queue.offerLast(n);
            }
        }

        queue.forEach(System.out::println);
    }
}