package BridgeDesignPattern;

import BridgeDesignPattern.Color.Color;

public class Rectangle extends Shape {

    Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        String filledColor = color.fillColor();
        System.out.println("Drawing Rectangle with Color    : " + filledColor);
    }
}
