public class Triangle extends Shape2d
{
    double a;

    public Triangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area() {
        a = x*y/2;
    }

    @Override
    public void display() {
        System.out.println("Area of Triangle:"+a);
    }
}
