package coffee;

public class CoffeeCup extends Cup {
    private String coffeeName;
    private boolean isCoffeeReady;
    private Products products; //agregracija

    public CoffeeCup(String coffeeName, boolean isCoffeeReady, Products products) {
        this.coffeeName = coffeeName;
        this.isCoffeeReady = isCoffeeReady;
        this.products = products;
    }

    @Override
    public String toString() {
        return "CoffeeCup{" +
                "coffeeName='" + coffeeName + '\'' +
                ", isCoffeeReady=" + isCoffeeReady +
                ", products=" + products.toString() +
                '}';
    }
}
