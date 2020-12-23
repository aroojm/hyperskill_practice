import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = true;
        Deque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                queue.offer(current);
            } else {
                if (queue.peekLast() == null) {
                    flag = false;
                    break;
                }
                char previous = queue.pollLast();
                if (!pairOf(current, previous)) {
                    flag = false;
                    break;
                }
            }
        }
        if (queue.size() != 0) flag = false;
        System.out.println(flag);
    }
    public static boolean pairOf(char c1, char c2) {
        boolean flag = false;
        switch (c1) {
            case ')':
                if (c2 == '(') flag = true;
                break;
            case '}':
                if (c2 == '{') flag = true;
                break;
            case ']':
                if (c2 == '[') flag = true;
                break;
            default:
                break;
        }
        return flag;
    }
}