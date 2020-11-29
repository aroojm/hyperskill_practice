import java.util.List;

class QualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
        for (Object obj : boxes) {
            if (!(obj instanceof Box)) {
                return false;
            }
            Box box = (Box) obj;
            if (!(box.get() instanceof Bakery)) {
                return false;
            }
        }
        return true;
    }

}

// Don't change the code below
class Bakery { }

class Cake extends Bakery { }

class Pie extends Bakery { }

class Tart extends Bakery { }

class Paper { }

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}