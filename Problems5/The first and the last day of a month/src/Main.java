import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int month = s.nextInt();
        LocalDate date1 = LocalDate.of(year, month, 1);
        LocalDate date2 = LocalDate.of(year, month, date1.lengthOfMonth());
        System.out.print(date1 + " ");
        System.out.println(date2);
    }
}