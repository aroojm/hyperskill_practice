import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        boolean check = false;
        if(str.toLowerCase().charAt(0) == 'j'){
            check = true;
        }

        System.out.println(check);
    }
}