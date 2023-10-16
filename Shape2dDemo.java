import java.util.Scanner;

public class Shape2dDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x,y:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Rectangle r = new Rectangle(x,y);
        r.area();
        r.display();
        Triangle m = new Triangle(x,y);
        m.area();
        m.display();
    }
}
