class Sum {
    public static int sumOfAreas(Shape[] array) {
        int sum = 0;
        for (Shape s : array) {
            Class c = s.getClass();
            if (c == Shape.class) {
                sum += 0;
            } else if (c == Square.class) {
                int l = ((Square) s).getSide();
                sum += (l * l);
            } else if (c == Rectangle.class) {
                int h = ((Rectangle) s).getHeight();
                int w = ((Rectangle) s).getWidth();
                sum += (h * w);
            }
        }
        return sum;
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}