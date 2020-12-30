import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        for (Shape s : array) {
            Class c = s.getClass();
            if (Shape.class == c) {
                shapes.add(s);
            } else if (Polygon.class == c) {
                polygons.add((Polygon) s);
            } else if (Square.class == c) {
                squares.add((Square) s);
            } else if (Circle.class == c) {
                circles.add((Circle) s);
            }
        }
    }
}

class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }