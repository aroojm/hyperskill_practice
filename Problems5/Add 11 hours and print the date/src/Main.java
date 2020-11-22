import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(LocalDateTime.parse(s.next()).plusHours(11).toLocalDate());
    }
}