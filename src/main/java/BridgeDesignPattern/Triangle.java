package BridgeDesignPattern;

import BridgeDesignPattern.Color.Color;

public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        String filledColor = color.fillColor();
        System.out.println("Drawing Triangle with Color     : " + filledColor);
    }
}
