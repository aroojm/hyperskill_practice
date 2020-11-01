import java.util.*;

class AsciiCharSequence implements java.lang.CharSequence {
    byte[] arr;
    // implementation
    AsciiCharSequence (byte[] arr){
        this.arr = arr;

    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char)arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(Arrays.copyOfRange(arr,start,end));
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += charAt(i);
        }
        return str;
    }
}