import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int i = 0;
        String s = "";
        while (flag){
            try {
                s = scan.nextLine();
                i = Integer.parseInt(s);

                if(i !=0 ){
                    System.out.println(i * 10);
                } else {
                    flag = false;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid user input: "+ s);
            }
        }
        scan.close();

    }
    }

