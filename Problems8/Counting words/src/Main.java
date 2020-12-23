import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        List<String> list = Arrays.asList(strings);
        SortedMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            if (map.containsKey(key)) {
                int val = map.get(key) + 1;
                map.put(key, val);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
    public static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}