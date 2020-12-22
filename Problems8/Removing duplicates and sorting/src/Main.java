import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        Set<String> set = new LinkedHashSet<>(list);
        set.forEach(System.out::println);
    }
}