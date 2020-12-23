import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner.nextLine().toLowerCase().split(" "));
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            if (map.containsKey(key)) {
                int val = map.get(key) + 1;
                map.put(key, val);
            } else {
                map.put(key, 1);
            }
        }
        for (var entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}