import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String pattern = "([01]{0,2}[0-9]{0,2}|[2]([0-4][0-9]|5[0-5]))";
        String regexp = pattern + "\\." + pattern + "\\." + pattern + "\\." + pattern;

        if (str.matches(regexp)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}