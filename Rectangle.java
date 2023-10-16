public class Rectangle extends Shape2d{

    double a;


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area()
    {
        a =  x*y;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle:"+a);
    }
}
