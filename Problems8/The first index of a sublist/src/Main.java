import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list1 = Arrays.asList(scanner.nextLine().split(" "));
        List<String> list2 = Arrays.asList(scanner.nextLine().split(" "));

        System.out.print(Collections.indexOfSubList(list1, list2) + " " + Collections.lastIndexOfSubList(list1, list2));

    }
}