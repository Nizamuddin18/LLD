package BridgeDesignPattern;

public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        String filledColor = color.fillColor();
        System.out.println("Drawing Circle with Color       : " + filledColor);
    }
}
