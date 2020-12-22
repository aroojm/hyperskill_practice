import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner.nextLine().split(" "));
        int num = scanner.nextInt();
        List<Integer> swap = new ArrayList<>();
        for (int i = 0; i < num * 2; i++) {
            swap.add(scanner.nextInt());
        }
        for (int i = 0; i < num * 2; i += 2) {
            Collections.swap(list, swap.get(i), swap.get(i + 1));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}