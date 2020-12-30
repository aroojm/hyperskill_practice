class Counter {
    public static int count2DShapes(Shape[] shapes) {
        int count = 0;
        for (Shape s : shapes) {
            Class c = s.getClass();
            if (c == Circle.class) {
                count++;
            } else if (c == Shape2DSub1.class) {
                count++;
            } else if (c == Shape2DSub2.class) {
                count++;
            }
        }

        return count;
    }
}

// Don't change the code below

class Shape {
}

class Shape2D extends Shape {
}

class Shape3D extends Shape {
}


class Circle extends Shape2D {
}

class Shape2DSub1 extends Shape2D {
}

class Shape2DSub2 extends Shape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}