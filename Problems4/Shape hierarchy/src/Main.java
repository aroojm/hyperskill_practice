abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double a,b,c;

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return a+b+c;
    }

    @Override
    double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

}

class Rectangle extends Shape {
    double l, w;

    public Rectangle(double l, double w) {
        super();
        this.l = l;
        this.w = w;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return (2*(l+w));
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return l*w;
    }

}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2*Math.PI *r;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * r * r;
    }

}
