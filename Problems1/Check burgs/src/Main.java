import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        boolean check = false;
        int len = str.length();

        if(len >= 4){
            if(str.substring(len-4).equalsIgnoreCase("burg") ){
                check = true;
            }
        }
        System.out.println(check);


    }
}