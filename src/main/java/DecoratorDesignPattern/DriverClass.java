package DecoratorDesignPattern;

public class DriverClass {


    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        System.out.println("Original IceCream : " + iceCream.getDescription() +
                            " , IceCream Price : " + iceCream.getCost());

        System.out.println("Adding ChocoChips Topping...");
        iceCream = new ChocoChipsDecorator(iceCream);
        System.out.println("IceCream Description : " + iceCream.getDescription() +
                " , IceCream Price : " + iceCream.getCost());

        System.out.println("Adding ChocolateSyrup Topping...");
        iceCream = new ChocolateSyrupDecorator(iceCream);
        System.out.println("IceCream Description : " + iceCream.getDescription() +
                " , IceCream Price : " + iceCream.getCost());
    }
}
