import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt() + 1;
        int input = scanner.nextInt();
        SortedMap<Integer, String> map = new TreeMap<>();
        SortedMap<Integer, String> result = new TreeMap<>();

        for (int i = 0; i < input; i++) {
            map.put(scanner.nextInt(), scanner.next());
        }
        result = map.subMap(from, to);
        result.forEach((k, v) -> System.out.println(k + " " +v));
    }
}