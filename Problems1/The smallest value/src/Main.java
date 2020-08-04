import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();


        while (i != 0) {
            if(i % 2 == 0){
                System.out.println("even");
            }
            else {System.out.println("odd");}
            i = scanner.nextInt();
        }

        scanner.close();

    }
}