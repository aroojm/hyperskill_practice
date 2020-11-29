import java.util.ArrayList;
import java.util.List;

/**
 * Class to work with
 */
class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        List<Box<? extends Bakery>> list = new ArrayList<>();
        Paper p = new Paper();
        Box paperBox = new Box<Paper>();
        paperBox.put(p);
        list.add(paperBox);
        return list;
    }

}