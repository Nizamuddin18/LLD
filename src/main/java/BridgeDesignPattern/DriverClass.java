package BridgeDesignPattern;

public class DriverClass {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new BlackColor());
        rectangle.draw();

        Shape triangle = new Triangle(new YellowColor());
        triangle.draw();

        Shape circle = new Circle(new RedColor());
        circle.draw();

    }
}
