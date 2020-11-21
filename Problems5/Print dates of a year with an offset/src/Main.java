import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] dateArray = s.next().split("-");
        int offset = s.nextInt();

        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);

        LocalDate date = LocalDate.of(year, month, day);
        while (date.getYear() == year) {
            System.out.println(date);
            date = date.plusDays(offset);
        }
    }
}