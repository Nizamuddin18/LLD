package DecoratorDesignPattern;

public class ChocoChipsDecorator extends IceCreamDecorator{
    IceCream iceCream;

    ChocoChipsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with ChocChips";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 25.0;
    }
}
