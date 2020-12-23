import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> track = new ArrayDeque<>();

        for (int i = 0; i < input; i++) {
            String str = scanner.nextLine();
            switch (str) {
                case "pop":
                    stack.pollLast();
                    track.pollLast();
                    break;
                case "max":
                    System.out.println(track.peekLast());
                    break;
                default:
                    int in = Integer.parseInt(str.substring(5, str.length()));
                    stack.offerLast(in);
                    if (track.peekLast() == null || track.peekLast() < in) {
                        track.offerLast(in);
                    } else {
                        track.offerLast(track.peekLast());
                    }
                    break;
            }
        }
    }
}