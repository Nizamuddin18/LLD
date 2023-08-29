package BridgeDesignPattern;

import BridgeDesignPattern.Color.Color;

public abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void draw();

}
