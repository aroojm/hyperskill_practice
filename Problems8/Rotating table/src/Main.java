import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                l.add(scanner.nextInt());
            }
            list.add(l);
        }
        int distance = scanner.nextInt();
        Collections.rotate(list, distance);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }

    }
}