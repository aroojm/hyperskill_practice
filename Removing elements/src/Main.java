import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        Set<Integer> set = new HashSet<>();
        list.forEach(x -> set.add(Integer.parseInt(x)));
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(e -> e > 10);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}