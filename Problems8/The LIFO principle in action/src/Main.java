import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < num; i++) {
            System.out.println(queue.pollLast());
        }
    }
}