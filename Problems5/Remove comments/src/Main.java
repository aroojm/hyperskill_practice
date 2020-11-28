import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();
        String regex = "(/\\Q*\\E.*?\\Q*\\E/|//.*)";
        System.out.println(codeWithComments.replaceAll(regex,""));
    }
}