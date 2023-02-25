package DecoratorDesignPattern;

import lombok.NoArgsConstructor;

//abstract decorator class
@NoArgsConstructor
public abstract class IceCreamDecorator implements IceCream {
    //base class object
    protected IceCream toppings;

    IceCreamDecorator(IceCream iceCream){
        this.toppings = iceCream;
    }

    @Override
    public String getDescription() {
        return toppings.getDescription();
    }

    @Override
    public Double getCost() {
        return toppings.getCost();
    }



}
