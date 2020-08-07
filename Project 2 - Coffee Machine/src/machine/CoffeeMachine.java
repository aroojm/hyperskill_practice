package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int money = 550;
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int dCups = 9;
    public static void main(String[] args) {
    runCoffeeMachine();

    }
    public static void runCoffeeMachine(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeType = scanner.nextLine();
                    if(coffeeType.equals("back")) {break;}
                    else { buy(Integer.parseInt(coffeeType));}
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printStatus();
                    break;
                case "exit":
                    flag = false;
                    break;
            }

        }
    }
    public static void printStatus(){
        System.out.println("The coffee machine has: \n" +
                + water + " of water \n" +
                + milk + " of milk \n" +
                + beans + " of coffee beans \n" +
                + dCups + " of disposable cups \n" +
                + money + " of money");
    }
    public static void buy(int coffeeType) {
        if (coffeeType == 1) {
            if (checkResources(1)) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 250;
                beans -= 16;
                dCups -= 1;
                money += 4;
            }
        } else if (coffeeType == 2) {
            if (checkResources(2)) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 350;
                milk -= 75;
                beans -= 20;
                dCups -= 1;
                money += 7;
            }
        } else if (coffeeType == 3) {
            if (checkResources(3)) {
                System.out.println("I have enough resources, making you a coffee!");
                water -= 200;
                milk -= 100;
                beans -= 12;
                dCups -= 1;
                money += 6;
            }
        }
    }
    public static boolean checkResources(int coffeeType){
        if(coffeeType == 1){
            if (water < 250) {System.out.println("Sorry, not enough water!"); return false;}
            if (beans < 16) {System.out.println("Sorry, not enough beans!"); return false;}
            if (dCups < 1) {System.out.println("Sorry, not enough disposable cups!"); return false;}
            return true;}
        else if (coffeeType == 2){
            if (water < 350) {System.out.println("Sorry, not enough water!"); return false;}
            if (milk < 75) {System.out.println("Sorry, not enough milk!"); return false;}
            if (beans < 20) {System.out.println("Sorry, not enough beans!"); return false;}
            if (dCups < 1) {System.out.println("Sorry, not enough disposable cups!"); return false;}
            return true;}
        else if (coffeeType == 3){
            if (water < 200) {System.out.println("Sorry, not enough water!"); return false;}
            if (milk < 100) {System.out.println("Sorry, not enough milk!"); return false;}
            if (beans < 12) {System.out.println("Sorry, not enough beans!"); return false;}
            if (dCups < 1) {System.out.println("Sorry, not enough disposable cups!"); return false;}
            return true;}
        else return false;
    }
    public static void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int w = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int m = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int b = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int c = scanner.nextInt();
        water += w; milk += m; beans += b; dCups += c;
    }
    public static void take(){
        System.out.println("I gave you $ " + money);
        money = 0;
    }


}
