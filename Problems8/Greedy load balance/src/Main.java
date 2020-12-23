import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();

        int load1 = 0;
        int load2 = 0;

        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            if (load1 <= load2) {
                queue1.offer(scanner.nextInt());
                load1 += scanner.nextInt();
            } else {
                queue2.offer(scanner.nextInt());
                load2 += scanner.nextInt();
            }
        }

        queue1.forEach(x -> System.out.print(queue1.poll() + " "));
        System.out.print("\n");
        queue2.forEach(x -> System.out.print(queue2.poll() + " "));
    }
}