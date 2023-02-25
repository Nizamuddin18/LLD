package DecoratorDesignPattern;

public class ChocolateIceCream implements IceCream{
    @Override
    public String getDescription() {
        return "ChocolateIceCream";
    }

    @Override
    public Double getCost() {
        return 70.0;
    }
}
