import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {

    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter w = new CharArrayWriter();
        for (String s : words) {
            w.write(s);
        }
        return w.toCharArray();
    }
}