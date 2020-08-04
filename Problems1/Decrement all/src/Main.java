import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer intObject1 = Integer.parseInt(scanner.next());

        int value1 = intObject1.intValue();

        Integer intObject2 = Integer.parseInt(scanner.next());

        int value2 = intObject2.intValue();

        Integer intObject3 = Integer.parseInt(scanner.next());

        int value3 = intObject3.intValue();

        Integer intObject4 = Integer.parseInt(scanner.next());

        int value4 = intObject4.intValue();

        System.out.println(--value1 + " " + --value2 + " " + --value3 + " " + --value4);




    }
}