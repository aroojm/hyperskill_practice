import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int month = s.nextInt();
        int offset = s.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println(date.plusDays(date.lengthOfMonth() - offset));
    }
}