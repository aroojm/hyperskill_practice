import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (allUpper(str)) {
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(str.toUpperCase());
            }
        }
    }

    public boolean allUpper(String str){
        char[] array = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}