import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        String input = scanner.nextLine();
        int given = scanner.nextInt();
        String[] inArray = input.split(" ");
        for (String string : inArray) {
            list.add(Integer.parseInt(string));
        }
        int size = list.size();
        int distance = Math.abs(given - list.get(0));
        for (int i = 1; i < size; i++) {
            int diff = Math.abs(given - list.get(i));
            if (diff < distance) {
                distance = diff;
            }
        }
        for (int i = 0; i < size; i++) {
            int diff = Math.abs(given - list.get(i));
            if (diff == distance) {
                result.add(list.get(i));
            }
        }
        result.sort(null);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

    }
}