import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int day1 = s.nextInt();
        int day2 = s.nextInt();
        int day3 = s.nextInt();

        System.out.println(LocalDate.ofYearDay(year, day1));
        System.out.println(LocalDate.ofYearDay(year, day2));
        System.out.println(LocalDate.ofYearDay(year, day3));
    }
}