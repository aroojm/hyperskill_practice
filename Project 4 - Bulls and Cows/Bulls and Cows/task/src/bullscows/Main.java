package bullscows;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String inputString = scanner.nextLine();
        String symbolString = "";
        int input = 0;
        int symbols = 0;
        if (inputString.matches("\\d+")) {
            input = Integer.parseInt(inputString);
            if (input <= 0) {
                System.out.println("Error");
                cont = false;
            }
        } else {
            cont = false;
            System.out.printf("Error: \"%s\" isn't a valid number.", inputString);
        }
        if (cont) {
            System.out.println("Input the number of possible symbols in the code:");
            symbolString = scanner.nextLine();
            symbols = Integer.parseInt(symbolString);
            if (symbols < input) {
                cont = false;
                System.out.printf("Error: it's not possible to generate a code " +
                        "with a length of %s with %s unique symbols.\n", inputString, symbolString);
            }
            if (symbols > 36) {
                cont = false;
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            }
        }
        if (cont) {
            play(input, symbols, scanner);
        }
    }
    private static void play(int input, int symbols, Scanner scanner) {
        String code = randomGenerator(input, symbols);
        System.out.println(printCode(input, symbols));
        System.out.println("Okay, let's start a game!");
        int turn = 1;
        String guess;
        boolean check;
        do {
            System.out.println("Turn " + turn + ":");
            guess = scanner.nextLine();
            check = grader(code, guess, input);
            turn++;
        } while (check);

    }
    private static String print(int bulls, int cows, int len) {
        if (bulls == 1 && cows > 1) {
            return "Grade: " + bulls + " bull and " + cows + " cows";
        } else if (bulls > 1 && cows == 1) {
            return "Grade: " + bulls + " bulls and " + cows + " cow";
        } else if (bulls == 1 && cows == 1) {
            return "Grade: " + bulls + " bull and " + cows + " cow";
        } else if (cows == 0 && bulls !=0) {
            if (bulls == len) {
                return "Grade: " + bulls + " bulls \n" +
                        "Congratulations! You guessed the secret code.";
            } else if (bulls == 1) {
                return "Grade: " + bulls + " bull";
            } else {
                return "Grade: " + bulls + " bulls";
            }
        } else if (bulls == 0 && cows != 0) {
            return "Grade: " + cows + " cows";
        } else if (bulls == 0 && cows == 0) {
            return "Grade: None";
        } else {
            return "Grade: " + bulls + " bulls and " + cows + " cows";
        }
    }
    private static String printCode(int num, int symbols) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("*");
        }
        String s1 = sb.toString();
        String s2 = "";
        if (symbols <= 10) {
            s2 = (symbols - 1) + "";
        } else if (symbols == 11) {
            s2 = "9, a";
        } else {
            s2 = "9, a-" + Character.toString((char)(symbols - 11 + 97));
        }
        return String.format("The secret is prepared: %s (0-%s).", s1, s2);
    }
    private static boolean grader(String codeString , String guessString, int len) {
        int bulls = 0;
        int cows = 0;
        int[] bullsArr = new int[len];
        int[] cowsArr = new int[len];
        for (int i = 0; i < len; i++) {
            if (guessString.charAt(i) == codeString.charAt(i)) {
                bulls++;
                bullsArr[i] = -1;
                cowsArr[i] = -1;
            }
        }
        for (int i = 0; i < len; i++) {
            if (bullsArr[i] == 0) {
                for (int j = 0; j < len ; j++) {
                    if (cowsArr[j] == 0 && (guessString.charAt(j) == codeString.charAt(i))) {
                        cows++;
                        break;
                    }
                }
            }
        }
        System.out.println(print(bulls, cows, len));
        return bulls < len;
    }
    public static String randomGenerator(int length, int symbols) {
        List<Character> randomList = new ArrayList<Character>(List.of('0','1','2','3','4','5',
                '6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                'q','r','s','t','u','v','w','x','y','z'));
        StringBuilder result = new StringBuilder();
        List<Character> subList = randomList.subList(0, symbols);;
        Collections.shuffle(subList);
        for (int i = 0; i < length; i++) {
            result.append(subList.get(i));
        }
        return result.toString();
    }
}
