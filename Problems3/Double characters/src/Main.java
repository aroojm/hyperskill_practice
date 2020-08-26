import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println( doubleChar(str));
    }
    public static String doubleChar(String str){
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i);
            str2 += str.charAt(i);
        }
        return str2;
    }
}