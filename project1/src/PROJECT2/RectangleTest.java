package PROJECT2;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Input length and width
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        // Display results
        System.out.printf("Rectangle Length: %.2f\n", rectangle.getLength());
        System.out.printf("Rectangle Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Area of Rectangle: %.2f\n", rectangle.calculateArea());
        System.out.printf("Perimeter of Rectangle: %.2f\n", rectangle.calculatePerimeter());

        scanner.close();
    }
}