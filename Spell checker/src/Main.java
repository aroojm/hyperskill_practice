import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dictionary = new ArrayList<>();
        List<String> text = new ArrayList<>();
        Set<String> notFound = new HashSet<>();

        int dEntries = scanner.nextInt();
        for (int i = 0; i < dEntries; i++) {
            dictionary.add(scanner.next());
        }
        int tEntries = scanner.nextInt();
        text.add(scanner.next());
        for (int i = 0; i < tEntries; i++) {
            text.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }
        for (int i = 0; i < dictionary.size(); i++) {
            dictionary.set(i,  dictionary.get(i).toLowerCase());
        }
        for (int i = 0; i < text.size(); i++) {
            text.set(i,  text.get(i).toLowerCase());
        }
        for (String txt : text) {
            if (!dictionary.contains(txt)) {
                notFound.add(txt);
            }
        }
        notFound.forEach(x -> System.out.println(x));
    }
}