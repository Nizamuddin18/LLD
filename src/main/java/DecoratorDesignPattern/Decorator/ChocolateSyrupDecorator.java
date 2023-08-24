package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Decorator.IceCreamDecorator;
import DecoratorDesignPattern.IceCream;
import org.apache.commons.lang3.StringUtils;

public class ChocolateSyrupDecorator extends IceCreamDecorator {
    private static final String DESCRIPTION = "with extra Chocolate Syrup ";
    IceCream iceCream;

    public ChocolateSyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        String iceCreamDescription = StringUtils.EMPTY;
        if (iceCream.getDescription().contains("with")) {
            iceCreamDescription = iceCream.getDescription() + " and" + DESCRIPTION;
        } else {
            iceCreamDescription = iceCream.getDescription() + DESCRIPTION;
        }
        return iceCreamDescription;
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 20;
    }
}
