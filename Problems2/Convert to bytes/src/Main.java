import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] b = inputStream.readAllBytes();
        for (byte a : b) {
            System.out.print(a);
        }
    }
}