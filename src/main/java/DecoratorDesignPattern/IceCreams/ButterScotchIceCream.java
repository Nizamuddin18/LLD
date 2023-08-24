package DecoratorDesignPattern.IceCreams;

import DecoratorDesignPattern.IceCream;

public class ButterScotchIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "ButterScotchIceCream";
    }

    @Override
    public Double getCost() {
        return 60.0;
    }
}
