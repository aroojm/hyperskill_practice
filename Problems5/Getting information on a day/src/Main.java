import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDate date = LocalDate.parse(s.next());
        System.out.print(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}