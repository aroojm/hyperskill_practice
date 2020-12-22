import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        int len = list.size();
        String str = list.get(len - 1);
        System.out.println(Collections.frequency(list, str) - 1);
    }
}