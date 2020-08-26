class Problem {
    public static void main(String[] args) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")){
                index = i;
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("-1");
        } else{System.out.println(index);}

    }
}