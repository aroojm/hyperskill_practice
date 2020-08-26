/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] array = getIntArray(args);
        switch (operator) {
            case "MAX":
                System.out.println(findMax(array));
                break;
            case "MIN":
                System.out.println(findMin(array));
                break;
            case "SUM":
                System.out.println(findSum(array));
                break;
            default:
                break;
        }
    }
    public static int[] getIntArray(String[] array){
        int[] intArray = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            intArray[i-1] = Integer.parseInt(array[i]);
        }
        return intArray;
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int findSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}