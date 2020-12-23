import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = Arrays.asList(scanner.nextLine().toLowerCase().split( ""));
        List<String> list2 = Arrays.asList(scanner.nextLine().toLowerCase().split( ""));

        Map<String, Integer> map1 = mapper(list1);
        Map<String, Integer> map2 = mapper(list2);

        boolean flag = false;

        Set<String> set1 = map1.keySet();
        Set<String> set2 = map2.keySet();

        if (list1.size() == list2.size() && set1.equals(set2)) {
            flag = true;
        }
        for (String str : set1) {
            if(map2.get(str) != map1.get(str)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "yes" : "no");
    }
    public static Map<String, Integer> mapper(List<String> list) {
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
        return map;
    }

}