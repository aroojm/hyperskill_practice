import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        while (scanner.hasNext()) {
            list1.add(scanner.next());
        }
        for (int i = 0; i < list1.size(); i += 2) {
            list2.add(list1.get(i));
        }
        list1.removeAll(list2);
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }

    }
}