import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        int len = list.get(0).length();
        int index = 0;
        String str;
        for (int i = 1; i < list.size(); i++) {
            int len2 = list.get(i).length();
            if (len2 > len) {
                len = len2;
                index = i;
            }
        }
        str = list.get(index);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}